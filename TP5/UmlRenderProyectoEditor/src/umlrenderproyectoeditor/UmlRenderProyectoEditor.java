/*
 * 
 */
package umlrenderproyectoeditor;

/**
 *
 */
public class UmlRenderProyectoEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear proyecto
        Proyecto proyecto = new Proyecto("Mi Pelicula", 120);
        
        // Crear editor de video
        EditorVideo editor = new EditorVideo();
        
        // Usar dependencia de creación: el editor crea un Render
        Render render = editor.exportar("MP4", proyecto);
        
        // Verificar la asociación unidireccional
        System.out.println("Render: " + render.getFormato());
        System.out.println("Proyecto: " + render.getProyecto().getNombre());
    }
}
    
    


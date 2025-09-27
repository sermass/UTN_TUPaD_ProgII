/*
 *
 */
package umlrenderproyectoeditor;

/**
 *
 */
public class EditorVideo {
    
    // Dependencia de creación: recibe parámetros y crea un Render
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando proyecto: " + proyecto.getNombre());
        System.out.println("Formato: " + formato);
        
        // Crear y retornar nuevo Render
        return new Render(formato, proyecto);
    }
}

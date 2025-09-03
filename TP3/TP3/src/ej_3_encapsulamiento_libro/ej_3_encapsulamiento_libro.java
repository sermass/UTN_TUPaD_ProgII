
package ej_3_encapsulamiento_libro;

/**
 *
 * 
 */
public class ej_3_encapsulamiento_libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        
        libro1.setAutor("Cortazar");
        libro1.setTitulo("Rayuela");
        System.out.println("Pruebo con anio 0");
        libro1.setAnioPublicacion(0);
        System.out.println("Pruebo con un anio real");
        libro1.setAnioPublicacion(1963);
        
        
        System.out.println(libro1.toString());
    }
    
}

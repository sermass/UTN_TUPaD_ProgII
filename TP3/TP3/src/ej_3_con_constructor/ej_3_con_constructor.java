
package ej_3_con_constructor;

/**
 *
 * 
 */
public class ej_3_con_constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro libro1 = new Libro("Cortazar","Rayuela",1960);
       System.out.println(libro1.toString());
       libro1.setAnioPublicacion(0);
       
       System.out.println("");
       System.out.println(libro1.toString());
       libro1.setAnioPublicacion(1963);
       System.out.println(libro1.toString());
    }
    
}

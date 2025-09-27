/*
 * 
 */
package umllibroautoreditorial;

/**
 *
 */
public class UmlLibroAutorEditorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          // Creo Autor y Editorial
        Autor autor1 = new Autor("G. G. Marquez", "Colombiano");
        Autor autor2 = new Autor( "J.R. Tolkien", "Ingles");
        Editorial editorial1 = new Editorial("libreria1", "Calle Falsa 123");
        
        // Crear libro con las relaciones
        Libro libro1 = new Libro("Cien anios de soledad", "94944", autor1, editorial1);
        libro1.setAutor(autor2);
        
        // Mostrar información
        System.out.println(libro1);
        
        // También se pueden crear más libros con el mismo autor/editorial
        Libro libro2 = new Libro("El amor en T colera", "94593", autor1, editorial1);
        System.out.println(libro2);
    }
}
        


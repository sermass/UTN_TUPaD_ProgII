/*
 * 
 */
package gestionbiblioteca;

/**
 *
 */
public class GestionBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo la biblioteca
        Biblioteca biblioteca1 = new Biblioteca("De Babel");
        
        //listado de libros
        System.out.println("Listado de libros del la biblioteca " + biblioteca1.getNombre() + " es: " );
        biblioteca1.listarLibros();
        
        //Creo los autores
        Autor autor1 = new Autor("a1", "Jorge L. Borges", "Argentino");
        Autor autor2 = new Autor("a2", "Gabriel Garcia Marquez", "Colombiano");
        Autor autor3= new Autor("a3", "Jose Saramago", "Portugues");
        
        //Ingreso libros a la biblioteca
        biblioteca1.agregarLibro(new Libro("9780060919658", "cien anios de soledad", 1967, autor2));
        biblioteca1.agregarLibro(new Libro("978eerty96p58", "Cronica de una muerte anunciada", 1981, autor2));
        biblioteca1.agregarLibro(new Libro("9780060919658", "El hombre duplicado", 2002, autor3));
        biblioteca1.agregarLibro(new Libro("978wryu919658", "Ensayo sobre la ceguera", 1981, autor3));
        biblioteca1.agregarLibro(new Libro("97zsugn909658", "El Aleph", 1949, autor1));
        
        //listado de libros
        System.out.println("");
        System.out.println("Listado de libros del la biblioteca " + biblioteca1.getNombre() + " es: " );
        biblioteca1.listarLibros();
        
        //Busco dos libros por isbn
        System.out.println("");
        System.out.println("El libro con isbn: 9780060919658 es: ");
        biblioteca1.mostrarLibroEncontrado(biblioteca1.buscarLibroPorIsbn("9780060919658"));
        System.out.println("");
        System.out.println("El libro con isbn: 978wryu919658 es: ");
        biblioteca1.mostrarLibroEncontrado(biblioteca1.buscarLibroPorIsbn("978wryu919658"));
        
        //filtro libros por año
        System.out.println("");
        System.out.println("los libros del anio 1981 son: ");
        biblioteca1.filtrarLibrosPorAnio(1981);
        
        //Elimino libro por isbn
        System.out.println("");
        System.out.println("Se eliminara libro: " );
        biblioteca1.mostrarLibroEncontrado(biblioteca1.buscarLibroPorIsbn("978eerty96p58"));
        biblioteca1.eliminarLibro("978eerty96p58");
        System.out.println("Listado actual de libros: ");
        biblioteca1.listarLibros();
        
        //Muestro la cantidad de libros de la biblioteca
        System.out.println("");
        System.out.println("La cantidad de libros del la biblioteca "+ biblioteca1.getNombre() + " es: " + biblioteca1.obtenerCantidadLibros());
        
        //Listo los autores disponibles
        System.out.println("");
        biblioteca1.mostrarAutoresDisponibles();
        
    }
}


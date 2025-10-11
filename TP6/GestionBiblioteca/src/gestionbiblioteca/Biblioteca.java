/*
 * 
 */
package gestionbiblioteca;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 */
public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);

    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca aun no tiene libros");
        }else{
            for (Libro libro : libros) {
                System.out.println(libro.mostrarInfo());
            }
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        int i = 0;
        while (i < this.libros.size() && !this.libros.get(i).getIsbn().equals(isbn)) {
            i++;
        }
        if (i < this.libros.size()) {
            libroEncontrado = this.libros.get(i);
        }
        return libroEncontrado;
    }  
    
    
    public void mostrarLibroEncontrado(Libro libroEncontrado){
        
        if (libroEncontrado == null) {
            System.out.println("No se encontro ese codigo isbn");
        }else{
            System.out.println(libroEncontrado);
        }
       
    }

    
    public void eliminarLibro(String isbn) {
        Libro L = buscarLibroPorIsbn(isbn);
       this.libros.remove(L);
    }

    public int obtenerCantidadLibros() {
        int contador = 0;
        for (Libro libro : libros) {
            contador ++;
        }
        return contador;

    }

    public void filtrarLibrosPorAnio(int anio) {
        ArrayList<String> listaDeLibros = new ArrayList<>();
        Libro libroEncontrado = null;
        int i = 0;
        while (i < this.libros.size()) {
            if (this.libros.get(i).getAnioPublicacion() == anio) {
                libroEncontrado = this.libros.get(i);
                listaDeLibros.add(libroEncontrado.getTitulo());
                i++;
            } else {
                i++;
            }

        }
        if (listaDeLibros.isEmpty()) {
             System.out.println("No se encontraron libros de ese anio");
             
        }else{
            System.out.println(listaDeLibros);
        }

    }

    public void mostrarAutoresDisponibles() {
        HashSet<String> autores = new HashSet<String>();
        if (libros.isEmpty()) {
            System.out.println("La biblioteca aun no tiene libros");
        } else {
            for (Libro libro : libros) {
                autores.add(libro.getAutor().getNombre());

            }
            System.out.println("Los autores incluidos en la biblioteca " + this.nombre + " son: ");
            for (String autor : autores) {
                System.out.println(autor);
            }
            
        }
        
        
        for (Libro libro : libros) {
            
            
        }

    }

}



package ej_3_con_constructor;

/**
 *
 * 
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
  // Constructor

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
        
// Getters y setters
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion <= 0)
        {
           System.out.println("El anio debe ser mayor que cero");
        }else{
            this.anioPublicacion = anioPublicacion;
        }
                
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + this.anioPublicacion + '}';
    }
    
}

    

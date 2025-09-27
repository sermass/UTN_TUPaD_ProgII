/*
 * 
 */
package umlcancionartistareproductor;

/**
 *
 */
public class Cancion {
    private String titulo;
    private Artista artista; // Asociación unidireccional Canción → Artista
    
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista; // Asociación unidireccional
    }
    
    // Método para obtener información completa de la cancion
    public String obtenerInformacion() {
        String infoArtista = artista != null ? 
            artista.getNombre() + " (" + artista.getGenero() + ")" : "Artista desconocido";
        return "Cancion: '" + titulo + "' - " + infoArtista;
    }
    
       
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Artista getArtista() {
        return artista;
    }
    
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    @Override
    public String toString() {
        return "Cancion{titulo='" + titulo + "'}";
    }
}

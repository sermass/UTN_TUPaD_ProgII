/*
 * 
 */
package umlcancionartistareproductor;

/**
 *
 */
public class Reproductor {
    private String nombre;
    private Cancion cancionActual; // guarda lo que se está reproduciendo
    
    public Reproductor(String nombre) {
        this.nombre = nombre;
    }
    
    // Dependencia de uso: Reproductor.reproducir(Cancion cancion)
    public void reproducir(Cancion cancion) {
        if (cancion == null) {
            System.out.println("No se puede reproducir una canción nula");
            return;
        }
        
        this.cancionActual = cancion;
        System.out.println("Reproducir: " + cancion.obtenerInformacion());
        System.out.println("Reproduccion en curso...");
    }
    
    // Método para pausar la reproducción
    public void pausar() {
        if (cancionActual != null) {
            System.out.println("Pausa: " + cancionActual.getTitulo());
        } else {
            System.out.println("No hay canción en reproducción");
        }
    }
    
    // Método para detener la reproducción
    public void detener() {
        if (cancionActual != null) {
            System.out.println("Detener: " + cancionActual.getTitulo());
            cancionActual = null;
        } else {
            System.out.println("No hay canción en reproducción");
        }
    }
    
    // Método para obtener información de la canción actual
    public void mostrarCancionActual() {
        if (cancionActual != null) {
            System.out.println("Actualmente reproduciendo: " + cancionActual.obtenerInformacion());
        } else {
            System.out.println("No hay canción en reproducción");
        }
    }
    
        
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Cancion getCancionActual() {
        return cancionActual;
    }
    
    @Override
    public String toString() {
        return "Reproductor{nombre='" + nombre + "'}";
    }
}


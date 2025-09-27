/*
 * 
 */
package umlcancionartistareproductor;

/**
 *
 */

public class UmlCancionArtistaReproductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        // Crear artistas
        Artista artista1 = new Artista("Genesis", "Sinfonica");
        Artista artista2 = new Artista("Taylor Swift", "Pop");
        Artista artista3 = new Artista("Metallica", "Heavy Metal");
                
        System.out.println("Artistas creados:");
        System.out.println("1. " + artista1);
        System.out.println("2. " + artista2);
        System.out.println("3. " + artista3);
      
       
        // Crear canciones con asociación unidireccional a artistas
        Cancion cancion1 = new Cancion("The trick", artista1);
        Cancion cancion2 = new Cancion("Shake It Off", artista2);
        Cancion cancion3 = new Cancion("Enter Sandman", artista3);
        Cancion cancion4 = new Cancion("Blank Space", artista2); // Mismo artista, diferente canción
        
        System.out.println("Canciones creadas:");
        System.out.println("1. " + cancion1.obtenerInformacion());
        System.out.println("2. " + cancion2.obtenerInformacion());
        System.out.println("3. " + cancion3.obtenerInformacion());
        System.out.println("5. " + cancion4.obtenerInformacion());
        
                
        // Crear reproductor
        Reproductor reproductor = new Reproductor("Mi Reproductor");
        System.out.println("Reproductor creado: " + reproductor);
        
        
        // Usar el metodo reproducir (dependencia de uso)
        System.out.println("Reproduciendo primera cancion");
        reproductor.reproducir(cancion1); // Dependencia de uso
        
        reproductor.mostrarCancionActual();
        
        System.out.println("\nPausando reproduccion ");
        reproductor.pausar();
       
      
    }
}
    


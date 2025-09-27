/*
 * 
 */
package umldocumentofirmausuario;

/**
 *
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma; // Composición: Documento → FirmaDigital
    
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        // La firma se crea después con el método firmar()
    }
    
    // Composición: el documento crea la firma
    public void firmar(Usuario usuario, String hash) {
        this.firma = new FirmaDigital(hash, usuario);
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public FirmaDigital getFirma() {
        return firma;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firma=" + firma + '}';
    }
    
    
}
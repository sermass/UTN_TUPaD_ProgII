/*
 * 
 */
package umldocumentofirmausuario;

/**
 *
 */
import java.util.Date;

public class FirmaDigital {
    private String codigoHash;
    private Date fecha;
    private Usuario usuario; // Agregación: FirmaDigital → Usuario
    
    public FirmaDigital(String codigoHash, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = new Date();
        this.usuario = usuario; // Agregación
    }
    
    public String getCodigoHash() {
        return codigoHash;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
}
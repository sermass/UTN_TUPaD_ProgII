/*
 * 
 */
package umlgeneradoqrusuariocodigoqr;

/**
 *
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación unidireccional CodigoQR → Usuario
    
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    
    public String getValor() {
        return valor;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
}

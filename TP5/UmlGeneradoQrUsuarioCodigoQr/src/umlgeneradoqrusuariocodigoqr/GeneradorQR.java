/*
 * 
 */
package umlgeneradoqrusuariocodigoqr;

/**
 *
 */
public class GeneradorQR {
    
    // Dependencia de creación: recibe parámetros y crea un CódigoQR
    public CodigoQR generar(String valor, Usuario usuario) {
        System.out.println("Generando codigo QR");
        System.out.println("Valor: " + valor);
        System.out.println("Para usuario: " + usuario.getNombre());
        
        // Crear y retornar nuevo CódigoQR
        return new CodigoQR(valor, usuario);
    }
}

/*
 *
 */
package umlgeneradoqrusuariocodigoqr;

/**
 *
 */
public class UmlGeneradoQrUsuarioCodigoQr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Crear usuario
        Usuario usuario = new Usuario("Ana", "ana@email.com");
        
        // Crear generador
        GeneradorQR generador = new GeneradorQR();
        
        // Usar dependencia de creación: el generador crea un CódigoQR
        CodigoQR qr = generador.generar("https://ejemplo.com/main", usuario);
        
        // Verificar la asociación unidireccional
        System.out.println("Codigo QR generado: " + qr.getValor());
        System.out.println("Usuario asociado: " + qr.getUsuario().getNombre());
    }
}

    


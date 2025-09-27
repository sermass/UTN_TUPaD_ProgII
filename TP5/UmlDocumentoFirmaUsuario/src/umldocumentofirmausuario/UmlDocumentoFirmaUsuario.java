/*
 * 
 */
package umldocumentofirmausuario;

/**
 *
 */
public class UmlDocumentoFirmaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Crear usuario (existe independientemente - Agregación)
        Usuario usuario = new Usuario("Carlos", "carlos@email.com");
        
        // Crear documento
        Documento documento = new Documento("Contrato", "Contenido del doc...");
        
        // Firmar documento (Composición: se crea la firma digital)
        documento.firmar(usuario, "123Hash");
        
        // Verificar relaciones
        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Firmado por: " + documento.getFirma().getUsuario().getNombre());
        System.out.println("Hash: " + documento.getFirma().getCodigoHash());
        
        // El usuario existe independientemente (Agregación)
        System.out.println("Usuario: " + usuario.getNombre());
    }
}
    
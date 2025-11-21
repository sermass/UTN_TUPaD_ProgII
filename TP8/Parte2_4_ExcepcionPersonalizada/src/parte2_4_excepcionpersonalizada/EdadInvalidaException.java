/*
 *
 */
package parte2_4_excepcionpersonalizada;

/**
 *
 */
public class EdadInvalidaException  extends Exception {
     
    // Constructor por defecto
    public EdadInvalidaException() {
        super("La edad ingresada no es valida");
    }
    
    // Constructor con mensaje personalizado
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
    
    // Constructor con mensaje y causa
    public EdadInvalidaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
    
    // Método para obtener el rango válido de edades
    public String getRangoValido() {
        return "El rango valido para la edad es: 0 - 120 anios";
    }
}

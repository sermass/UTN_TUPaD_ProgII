/*
 * 
 */
package parte2_4_excepcionpersonalizada;

/**
 *
 */
public class ValidadorDeEdad {
    // Método que valida la edad y lanza la excepción personalizada
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException(
                "La edad no puede ser negativa. Edad ingresada: " + edad
            );
        }
        
        if (edad > 120) {
            throw new EdadInvalidaException(
                "La edad no puede ser mayor a 120 anios. Edad ingresada: " + edad
            );
        }
    }
    
    // Método que procesa la edad y devuelve un mensaje
    public static String procesarEdad(int edad) {
        try {
            validarEdad(edad);
            return "Edad válida: " + edad + " años";
        } catch (EdadInvalidaException e) {
            return e.getMessage() + ". " + e.getRangoValido();
        }
    }
}

/*
 * 
 */
package parte2_2_cadenaanumero;

import java.util.Scanner;

/**
 *
 */
public class Parte2_2_CadenaANumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entero: ");
        String texto = scanner.nextLine();
        
        try {
            // Intentar convertir el texto a int
            int numero = Integer.parseInt(texto);
            System.out.println("Numero convertido exitosamente: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto '" + texto + "' no es un numero entero valido.");
            System.out.println("Mensaje de error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Conversion finalizada.");
        }
    }
    
}

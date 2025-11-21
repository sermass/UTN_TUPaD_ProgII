/*
 * 
 */
package parte2_4_excepcionpersonalizada;

import java.util.Scanner;

/**
 *
 */
public class Parte2_4_ExcepcionPersonalizada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
                
        System.out.println("=== VALIDADOR DE EDADES ===");
        System.out.println("Ingrese edad para validar ");
        
           try {
                System.out.print("\nIngrese una edad: ");
                int edad = scanner.nextInt();
                                         
                // Validar la edad
                ValidadorDeEdad.validarEdad(edad);
                
                // Si llegamos aquí, la edad es válida
                System.out.println("Edad valida registrada: " + edad + " anios");
                
                                
            } catch (EdadInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Error! " + e.getRangoValido());
                
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Debe ingresar un numero entero valido");
                scanner.next(); // Limpiar el buffer del scanner
            }
        
        
        scanner.close();
        System.out.println("Programa finalizado.");
    
    }
    
}

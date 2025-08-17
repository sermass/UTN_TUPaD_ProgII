/*
 Reparacion de error en programa 
 */
package error_java;

import java.util.Scanner;


public class Error_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingresa tu nombre: ");
       String nombre = scanner.nextLine(); // ERROR
       System.out.println("Hola, " + nombre);
    }
    
}

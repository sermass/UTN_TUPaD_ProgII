/*
 * 
 */
package parte2_1_divisionsegura;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class Parte2_1_DivisionSegura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        Scanner scanner = new Scanner(System.in);

        try {
            // Ingresa el primer número (dividendo)
            System.out.print("Ingrese el primer numero (dividendo): ");
            double dividendo = scanner.nextDouble();

            // Ingresa el segundo número (divisor)
            System.out.print("Ingrese el segundo numero (divisor): ");
            double divisor = scanner.nextDouble();

            // Realizar la división
            double resultado =  dividir(dividendo, divisor); //dividendo/divisor ; //
            System.out.println("El resultado de la division es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");

            //InputMismatchException error de tiempo de ejecución que se produce cuando un tipo de datos incorrecto es ingresado por el usuario
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar solo numeros validos.");
        } finally {
            scanner.close();
        }
    }

    // Método para realizar la división con manejo de excepciones
    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor no puede ser cero");
        }
        return dividendo / divisor;
    }
}

    
    


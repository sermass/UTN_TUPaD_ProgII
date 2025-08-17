/*
 Programa que sirve para visualizar la division entera en java
 */
package division_enteros;

import java.util.Scanner;


public class Division_enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definicion de variables
        Scanner input = new Scanner(System.in);
        int dividendo, divisor, division;
                    
        System.out.print("Ingrese el dividendo de la division entera: ");
        dividendo = input.nextInt();
        
        System.out.print("Ingrese el divisor de la division entera: ");
        divisor = input.nextInt();
        
        division = dividendo / divisor;
        
        System.out.println("La division entera entre los dos numeros es: " + division);
    }
    
}

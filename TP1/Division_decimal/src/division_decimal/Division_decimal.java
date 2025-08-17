/*
 Programa para aplicar el cambio de tipo de variable con casting explicito
 */
package division_decimal;

import java.util.Scanner;


public class Division_decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definicion de variables
        Scanner input = new Scanner(System.in);
        int dividendo, divisor;
        double division;
                    
        System.out.print("Ingrese el dividendo de la division entera: ");
        dividendo = input.nextInt();
        
        System.out.print("Ingrese el divisor de la division entera: ");
        divisor = input.nextInt();
        
        division = (double) dividendo / divisor; //casting explicito en la variable dividendo
        
        System.out.println("La division entera entre los dos numeros es: " + division);
    }
    
}

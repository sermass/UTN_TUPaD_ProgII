/*
Programa que realiza las operacines matematicas basicas
 */
package operaciones_matematicas;

import java.util.Scanner;


public class Operaciones_Matematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definicion de variables
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        
        //Ingreso de valores
        System.out.print("Ingrese el primer numero: ");
        numero1 = input.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        numero2 = input.nextInt();
        
        //operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multip = numero1 * numero2;
        double division = numero1 / numero2;
        
        System.out.println("La suma de los numeros ingresados es: " + suma);
        System.out.println("La resta de los numeros ingresados (el primero menos el segundo) es: " + resta);
        System.out.println("La multiplicacion de los numeros ingresados es: " + multip);
        System.out.println("La division entera de los numeros ingresados (el primero dividido el segundo) es: " + division);
        
    }
    
}

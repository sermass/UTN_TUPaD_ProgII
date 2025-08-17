/*
 Programa parapracticar ingreso de valores por usuarios
 */
package scaner_java;

import java.util.Scanner;


public class Scaner_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion de variables
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        //ingreso de valores
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(input.nextLine());
        
        //Salida por consola
        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad);
        
    }
    
}

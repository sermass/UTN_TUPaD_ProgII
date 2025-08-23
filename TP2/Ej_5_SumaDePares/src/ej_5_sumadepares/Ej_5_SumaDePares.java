/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_5_sumadepares;

import java.util.Scanner;

/**
 * 5. Suma de Números Pares (while).
 * Escribe un programa que solicite números al usuario y sume solo los números 
 * pares. El ciclo debe continuar hasta que el usuario ingrese el número 0, 
 * momento en el que se debe mostrar la suma total de los pares ingresados.
 */
public class Ej_5_SumaDePares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num, suma = 0;
        
        System.out.print("Ingrese un numero (0 para terminar): ");
        num = input.nextInt();
        
        while (num != 0){
            if (num%2 == 0){
                suma += num;
            }
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = input.nextInt();
        }
        System.out.println("La suma de los numeros pares es: " + suma);
    }
    
}

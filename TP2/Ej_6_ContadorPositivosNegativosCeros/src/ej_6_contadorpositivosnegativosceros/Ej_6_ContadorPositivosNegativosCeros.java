/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_6_contadorpositivosnegativosceros;

import java.util.Scanner;

/**
 * 6. Contador de Positivos, Negativos y Ceros (for).    
 * Escribe un programa que pida al usuario ingresar 10 números enteros y
 * cuente cuántos son positivos, negativos y cuántos son ceros.
 */
public class Ej_6_ContadorPositivosNegativosCeros {

    /**     
     
     * @param args
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int numero, positivos = 0, negativos = 0, ceros = 0;
        
                
        for (int i = 0; 10 > i; i++){
            System.out.print("Ingrese el numero " + (i + 1) +": ");
            numero = input.nextInt();
            if (numero > 0) {
                positivos ++;
                        
            }else if(numero < 0){
                negativos ++;
                
            }else{
                ceros ++;
            }
        }
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
    
}

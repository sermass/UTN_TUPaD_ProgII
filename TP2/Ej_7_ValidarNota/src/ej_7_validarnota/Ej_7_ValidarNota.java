/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_7_validarnota;

import java.util.Scanner;

/**
 * Validación de Nota entre 0 y 10 (do-while).
 * 
 * Escribe un programa que solicite al usuario una nota entre 0 y 10. 
 * Si el usuario ingresa un número fuera de este rango, debe seguir pidiéndole
 * la nota hasta que ingrese un valor válido
 */
public class Ej_7_ValidarNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double nota;
        
        System.out.print("Ingrese una nota: ");
        nota = input.nextDouble();
        
        while (nota < 0 || nota > 10){
            System.out.print("Error!! : Nota no valida. Ingrese una nota entre 0 y 10: ");
            nota = input.nextDouble();
        }
        
        System.out.println("Nota guardada correctamente");
    }
    
}

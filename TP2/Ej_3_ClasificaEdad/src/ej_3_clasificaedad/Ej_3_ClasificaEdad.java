/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_3_clasificaedad;

import java.util.Scanner;

/**
* Clasificación de Edad.
* Escribe un programa en Java que solicite al usuario su edad y 
* clasifique su etapa de vida según la siguiente tabla:
* Menor de 12 años: "Niño"
* Entre 12 y 17 años: "Adolescente"
* Entre 18 y 59 años: "Adulto"
* 60 años o más: "Adulto mayor"
*/

public class Ej_3_ClasificaEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        
        if (edad < 12){
            System.out.println("Eres un Ninio");
        }else if (edad >= 12 && edad < 18){
            System.out.println("Eres un Adolescente");
        } else if (edad >= 18 && edad < 60) {
            System.out.println("Eres un Adulto");
        } else {
            System.out.println("Eres un Adulto mayor");
        }

    }
    
}

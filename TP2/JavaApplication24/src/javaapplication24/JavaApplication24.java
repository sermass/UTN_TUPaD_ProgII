/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author Mama y Papa
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 3) {

            System.out.println("Conteo externo: " + contador);

            for (int i = 1; i <= 4; i++) {

                System.out.println("  Conteo interno: " + i);

            }

            contador++;
        }

    }
}

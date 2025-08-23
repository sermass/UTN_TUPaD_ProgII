/*
 * 2.	Determinar el Mayor de Tres Números.
 * Escribe un programa en Java que pida al usuario tres números enteros
 * y determine cuál es el mayor.
 */
package ej_2_mayordetres;

import java.util.ArrayList;
import java.util.Scanner;


public class Ej_2_MayorDeTres {

   // Constantes
    final static int CANTIDAD_DE_NUMEROS = 3;
    
    public static void main(String[] args) {
               
        ArrayList<Double> notas = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double nota;
        
        for (int i = 0; i < CANTIDAD_DE_NUMEROS; i++) {
            System.out.print("Ingrese la nota numero " + (i + 1) + ": ");
            nota = input.nextDouble();
            notas.add(nota);
        }
               
        
        BuscarElMayor(notas);
        System.out.println("La nota mayor es: " + BuscarElMayor(notas));
        
    }
        
    static double BuscarElMayor(ArrayList<Double> lista){
        
        double mayor = 0;
        for (int i = 0; i < lista.size() ; i++) {
                        
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i) > mayor){
                    mayor = lista.get(i);
                      
                }
                
            }
        }
        return mayor;
        
    }
}

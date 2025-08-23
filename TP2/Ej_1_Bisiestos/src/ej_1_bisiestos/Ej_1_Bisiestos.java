/*
* 1.	Verificación de Año Bisiesto.
* Escribe un programa en Java que solicite al usuario un año y determine si es
* bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que
* sea divisible por 400.
*/
package ej_1_bisiestos;

import java.util.Scanner;


public class Ej_1_Bisiestos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anio;
        
        //Se ingresa el año a verificar
        System.out.print("Ingrese un anio: ");
        anio = Integer.parseInt(input.nextLine());
         
        if (VerificarBisiesto(anio)){
            
            System.out.println("El anio " +anio+ " es bisiesto");
        }else{
            System.out.println("El anio " +anio+ " no es bisiesto");
        }

       
    }
    
    static boolean VerificarBisiesto(int anio){
            
        if ((anio%4 == 0 && anio%100 != 0) || anio%400 == 0){
                
            return true;
        }
        return (false);
    }
}

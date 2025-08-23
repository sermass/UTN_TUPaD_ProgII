/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_11_descuentoespecial;

import java.util.Scanner;

/**
 *
 * 11. Cálculo de descuento especial usando variable global.
 *   
 * Declara una variable global Ejemplo de entrada/salida: = 0.10.
 * Luego, crea un método calcularDescuentoEspecial(double precio) que use la
 * variable global para calcular el descuento especial del 10%.
 * Dentro del método, declara una variable local descuentoAplicado, almacena
 * el valor del descuento y muestra el precio final con descuento.
 */
public class Ej_11_DescuentoEspecial {

    /**
     * @param args the command line arguments
     */
    static double descuento = 0.10;
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precio;
        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        calcularDescuentoEspecial(precio);
    }
    
    public static void calcularDescuentoEspecial(double precio){
        
        double descuentoAplicado = precio*descuento;
        
        System.out.println("El descuento aplicado es de $" + descuentoAplicado);
        System.out.println("El precio final con el descuento del " + (descuento*100) +"% es $" + (precio - descuentoAplicado));
    }
    
}

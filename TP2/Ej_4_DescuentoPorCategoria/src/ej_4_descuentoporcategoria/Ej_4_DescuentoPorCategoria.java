/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_4_descuentoporcategoria;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
 * Luego, aplique los siguientes descuentos:
 * Categoría A: 10% de descuento
 * Categoría B: 15% de descuento
 * Categoría C: 20% de descuento
 * El programa debe mostrar el precio original, el descuento aplicado y el precio final
 */
public class Ej_4_DescuentoPorCategoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese el precio del producto: ");
    int precio;
    precio = Integer.parseInt(input.nextLine());
    
    System.out.print("Ingrese la categoría del producto (A, B o C): ");
    
    String categoria = input.nextLine();
    char opcion = categoria.toUpperCase().charAt(0);
   
    switch (opcion){
        case 'A' :
            System.out.println("Tiene un 10% de descuento");
            System.out.println("Precio del producto: " + precio);
            System.out.println("Precio con descuento: " + precio*0.9);
            break;
        case 'B':
            System.out.println("Tiene un 15% de descuento");
            System.out.println("Precio del producto: " + precio);
            System.out.println("Precio con descuento: " + precio*0.85);
            break;
        case 'C':
            System.out.println("Tiene un 20% de descuento");
            System.out.println("Precio del producto: " + precio);
            System.out.println("Precio con descuento: " + precio*0.8);
            break;
    }
    
   }
    
}

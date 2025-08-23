/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_10_actualizarstock;

import java.util.Scanner;

/**
 *10. Actualización de stock a partir de venta y recepción de productos.
 * Crea un método actualizarStock(int stockActual, int cantidadVendida,
 * int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
 * de productos: NuevoStock = StockActual − CantidadVendida + CantidadRecibida
 */
public class Ej_10_ActualizarStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidadVendida, cantidadRecibida, nuevoStock;
        
        
        System.out.print("Ingrese el stock actual: ");
        int stockActual = input.nextInt();
         System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = input.nextInt();
         System.out.print("Ingrese ls cantidad recibida: ");
        cantidadRecibida = input.nextInt();
        
        nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    public static int actualizarStock(int stockActual, int vendido, int recibido){
        int nuevoStock = stockActual - vendido + recibido;
        return nuevoStock;
    }
    
}

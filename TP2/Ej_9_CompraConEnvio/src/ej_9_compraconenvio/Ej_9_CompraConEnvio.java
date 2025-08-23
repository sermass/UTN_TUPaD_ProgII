/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_9_compraconenvio;

import java.util.Scanner;

/**
 *Composición de funciones para calcular costo de envío y total de compra.

 * a. calcularCostoEnvio(double peso, String zona): Calcula el costo de envío
 * basado en la zona de envío (Nacional o Internacional) y el peso del paquete. 
 * Nacional: $5 por kg
 * Internacional: $10 por kg 
 
 * b. calcularTotalCompra(double precioProducto, double costoEnvio): 
 * Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío. 
 * Desde main(), solicita el peso del paquete, la zona de envío y el precio del
 * producto. Luego, muestra el total a pagar.
 
 */
public class Ej_9_CompraConEnvio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double peso,precio, totalAPagar, costoEnvio;
       String zona;
       
       System.out.print("Ingrese el precio del producto: ");
       precio = input.nextDouble();
       
       System.out.print("Ingrese el peso del producto: ");
       peso = input.nextDouble();
       input.nextLine();
       
       System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
       zona = input.nextLine();
       while (!(zona.equalsIgnoreCase("NACIONAL") || zona.equalsIgnoreCase("INTERNACIONAL"))){
           System.out.println("Error: Debe ingresar nacional o internacional: Ingrese nuevamente: ");
           zona = input.nextLine();
       }
       
       costoEnvio = calcularCostoEnvio(peso, zona);
       System.out.println("Costo de envio $" + costoEnvio);
       totalAPagar = calcularTotalCompra(precio, costoEnvio);               
       System.out.println("Total a pagar: " + totalAPagar);
    }
    public static double calcularCostoEnvio(double peso, String zona){
        
        int valorZona = 0;
        if ("NACIONAL".equalsIgnoreCase(zona)) {
            valorZona = 5;
        }else if("INTERNACIONAL".equalsIgnoreCase(zona)){
            valorZona = 10;
        }
        
        return peso*valorZona;
        
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
}

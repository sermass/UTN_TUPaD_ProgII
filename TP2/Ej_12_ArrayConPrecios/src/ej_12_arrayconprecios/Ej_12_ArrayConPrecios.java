/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_12_arrayconprecios;

/**
 * Modificación de un array de precios y visualización de resultados.
 * Crea un programa que:
 * a. Declare e inicialice un array con los precios de algunos productos.
 * b. Muestre los valores originales de los precios.
 * c. Modifique el precio de un producto específico.
 * d. Muestre los valores modificados.
 */
public class Ej_12_ArrayConPrecios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
       System.out.println("Precios originales:");
       imprimirPrecios(precios);
       precios[2] = 129.99;
       System.out.println("Precios modificados:");
       imprimirPrecios(precios);
    }
    
    public static void imprimirPrecios(double[] precios){
        for (double precio : precios) {
            System.out.println("precio: $" +precio);
            
        }
    }
    
}

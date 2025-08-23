/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_13_arrayconpreciosrecursivos;

/**
 *Impresión recursiva de arrays antes y después de modificar un elemento.
 * Crea un programa que:
 * a. Declare e inicialice un array con los precios de algunos productos.
 * b. Use una función recursiva para mostrar los precios originales.
 * c. Modifique el precio de un producto específico.
 * d. Use otra función recursiva para mostrar los valores modificados.
 */
public class Ej_13_ArrayConPreciosRecursivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double[] precios = {199.99, 299.5, 149.75, 399, 89.99};
       int indice = 0;
       System.out.println("Precios originales:");
       imprimirPrecios(precios, indice);
       precios[2] = 129.99;
       System.out.println("Precios modificados:");
       imprimirPrecios(precios, indice);
    }
    
    public static void imprimirPrecios(double[] precios, int indice){
        
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirPrecios(precios, indice + 1);
            
        }
    }
    
}

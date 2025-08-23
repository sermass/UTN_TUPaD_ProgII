/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_8_preciofinal;

import java.util.Scanner;

/**
*8. Cálculo del Precio Final con impuesto y descuento.

* Crea un método calcularPrecioFinal(double impuesto, double descuento) 
* que calcule el precio final de un producto en un e-commerce. La fórmula es:

* PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)

* Desde main(), solicita el precio base del producto, el porcentaje de impuesto 
* y el porcentaje de descuento, llama al método y muestra el precio
 */
public class Ej_8_PrecioFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double precio, impuesto, descuento, precioFinal;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        
        System.out.print("Ingrese el % de impuesto (ejemplo 10 para 10%): ");
        impuesto = input.nextDouble();
        
        System.out.print("Ingrese el % de descuento (ejemplo 10 para 10%): ");
        descuento = input.nextDouble();
        
        
        precioFinal = CalcularPrecioFinal(precio, impuesto, descuento);
        System.out.println("El precio final del producto es: $" + precioFinal);
    }
    
    //Ademas de los parametros impuesto y descuento requeridos en el problema 
    //agrego precio para no tener que pedirlo dentro de la funcion
    public static double CalcularPrecioFinal(double precio, double impuesto, double descuento){
        return precio + precio*impuesto/100 - precio*descuento/100;
    }
    
}

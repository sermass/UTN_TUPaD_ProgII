
package ej_2_mascotas;

/**
 *
 * 
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println(nombre + " " + especie + " " + edad);
    }
    
    int cumplirAnios (){
        return (edad += 1);
    }
}

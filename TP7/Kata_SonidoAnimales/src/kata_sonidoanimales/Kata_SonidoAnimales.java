/*
 *
 */
package kata_sonidoanimales;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Kata_SonidoAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Creo lista de animales
        List<Animal> animales = new ArrayList<>();
        
        // Agregar animales de diferentes tipos
        animales.add(new Perro("Max", 3, "Labrador", "Grande"));
        animales.add(new Gato("Luna", 2, "Negro", "pequeño"));
        animales.add(new Vaca("Margarita", 5, "Averdeen", "Lechera"));
        animales.add(new Perro("Bobby", 1, "Chihuahua", "Pequeño"));
        animales.add(new Gato("Simba", 4, "Naranja", "Grande"));
        animales.add(new Vaca("Blanca", 7, "Jersey", "Organica"));
        
        // Demostración de polimorfismo
        System.out.println("=== SONIDOS DE LOS ANIMALES (POLIMORFISMO) ===");
        for (Animal animal : animales) {
            animal.describirAnimal();
            System.out.print("   Sonido: ");
            animal.hacerSonido(); // Polimorfismo: mismo método, diferentes comportamientos
            System.out.println();
        }
    }
    
}

/*
 * 
 */
package kata_sonidoanimales;

/**
 *
 */
public class Gato extends Animal{
    private String color;

    public Gato(String nombre, int edad, String color, String tipo) {
        super(nombre, tipo, edad);
        this.color = color;
    }
    
    public void hacerSonido(){
        System.out.println("Gato maulla Miau! Miau!");
    }
    
    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("   Nombre: " + super.getNombre() + " Color: " + color + " Edad: " + super.getEdad());
    }
}

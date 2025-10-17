/*
 * 
 */
package kata_sonidoanimales;

/**
 *
 */
public class Animal {
    
    private String nombre;
    private String tipo;
    private int edad;

    public Animal(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }
    
    
    public void hacerSonido(){
        System.out.println("Sonido de animal");
    }
    
    public void describirAnimal(){
        System.out.println("");
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }
    
    
}

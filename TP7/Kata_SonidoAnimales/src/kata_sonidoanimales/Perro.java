/*
 *
 */
package kata_sonidoanimales;

/**
 *
 */
public class Perro extends Animal{
    private String raza;

    public Perro( String nombre, int edad, String raza, String tipo) {
        super(nombre, tipo, edad);
        this.raza = raza;
    }

    @Override
   public void hacerSonido(){
        System.out.println("Perro ladra Guau! Guau!");
    }
    
   @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("   Raza: " + raza + " Edad: " + super.getEdad());
    }
    
}

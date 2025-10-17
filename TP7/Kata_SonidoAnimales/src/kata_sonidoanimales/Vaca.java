/*
 * 
 */
package kata_sonidoanimales;

/**
 * 
 */
public class Vaca extends Animal{
    private String raza;

    public Vaca(String nombre, int edad, String raza, String tipo) {
        super(nombre, tipo, edad);
        this.raza = raza;
    }
    
    public void hacerSonido(){
        System.out.println("La vaca muge Muu! Muu!");
    }
    
    @Override
    public void describirAnimal() {
        super.describirAnimal();
        System.out.println("   Raza: " + raza + " Tipo: " + super.getTipo() + " Edad: " + super.getEdad());
    }
}

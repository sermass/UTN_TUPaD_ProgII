/*
 *
 */
package kata_vehiculo;

/**
 *
 */
public class Auto extends Vehiculo{
   
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("Cantidad de puertas: " + cantidadPuertas);
    }
}

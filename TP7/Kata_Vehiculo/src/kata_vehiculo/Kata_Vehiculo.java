/*
 * 
 */
package kata_vehiculo;

/**
 *
 */
public class Kata_Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo dos autos
        Auto a = new Auto(4,"Fiat", "Tipo");
        Vehiculo v = new Auto(2, "Fiat","600");
        
        //Muestro su informacion
        a.mostrarInfo();
        System.out.println("");
        v.mostrarInfo();
        
    }
    
}

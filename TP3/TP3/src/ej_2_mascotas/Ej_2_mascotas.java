
package ej_2_mascotas;

/**
 *
 */
public class Ej_2_mascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Juanita";
        mascota1.especie = "tortuga";
        mascota1.edad = 6;
        
        mascota1.mostrarInfo();
        //simulo el paso del tiempo
        for (int i = 0; i < 10; i++) {
            mascota1.cumplirAnios();
            mascota1.mostrarInfo();
        }
    }
    
}

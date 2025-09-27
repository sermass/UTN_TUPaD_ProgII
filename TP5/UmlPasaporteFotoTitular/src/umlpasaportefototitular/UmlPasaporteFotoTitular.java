/*
 * 
 */
package umlpasaportefototitular;

/**
 *
 * 
 */
public class UmlPasaporteFotoTitular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Titular titular = new Titular("Ser Mass", "111222333");
        Pasaporte pasaporte = new Pasaporte("123456", "12 de abril", "foto.jpg", "4x4");
        titular.setPasaporte(pasaporte); // Solo un setter necesario
        System.out.println("Titular: \n- nombre: " + titular.getNombre() + "\n- dni: " + titular.getDni());
        System.out.println("Pasaporte: " + titular.getPasaporte().getNumero() + " (" + titular.getPasaporte().getFecha() + ")");
        pasaporte.mostrarFoto();
        System.out.println("Foto: " + pasaporte.mostrarFoto() + " (" + pasaporte.mostrarFormato() + ")");
    }
}

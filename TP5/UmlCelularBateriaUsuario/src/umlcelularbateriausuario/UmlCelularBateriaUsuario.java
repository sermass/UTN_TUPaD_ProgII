/*
 *
 */
package umlcelularbateriausuario;

/**
 *
 */
public class UmlCelularBateriaUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria bat1 = new Bateria("energizer", "12v");
        Usuario usuario = new Usuario("Ser Mass", "111222333");
        Celular celular = new Celular(123456, "Motorola", "S3", bat1);
        
        usuario.setCelular(celular); // Solo un setter necesario
        System.out.println("Usuario: \n- nombre: " + usuario.getNombre() + "\n- dni: " + usuario.getDni());
        System.out.println("Celular: " + usuario.getCelular().getMarca() + " (" + usuario.getCelular().getModelo() + ")");
        System.out.println("Bateria: " + celular.getBateria().getModelo()+ " (" + celular.getBateria().getCapacidad() + ")");
        
        System.out.println("");
        
        celular.mostrar();
        
    }
}




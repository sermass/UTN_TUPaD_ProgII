package ej_4_gallinas;

/**
 *
 * 
 */
public class ej_4_gallinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instanciar dos gallinas
        Gallina gallina1 = new Gallina(1, 2, 14);
        Gallina gallina2 = new Gallina(2, 3, 20);
        
        //Mostrar estado original
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        //Simulacion de envejecer
        gallina1.envejecer();
        gallina2.envejecer();
        
        //simulacion de poner huevo
        gallina1.ponerHuevo(2);
        gallina2.ponerHuevo(1);
        
        //Mostrar estado final
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        
    }
    
}

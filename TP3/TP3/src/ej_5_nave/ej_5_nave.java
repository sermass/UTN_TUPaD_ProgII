package ej_5_nave;

/**
 *
 * 
 */
public class ej_5_nave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NaveEspacial nave = new NaveEspacial("Endurance" , 50);
       
       //despega y avanza 28 anios luz
        System.out.println("Trata de avanzar 25 pero no le alcanza el combustible");
        nave.despegar();
        nave.avanzar(28);
        System.out.println("");
        
        //recarga combustible
        System.out.println("Recarga 30");
        nave.recargarCombustible(30);
        System.out.println("");
        
        //avanza 25 anios luz   
        System.out.println("Ahora si avanza 28");
        nave.avanzar(28);
        System.out.println("");
        
       
        //muestra estado
        System.out.println("Muestra el estado final");    
        System.out.println("nave :" + nave.getNombre());
        System.out.println("Cantidad de combustible :" + nave.getCombustible());
       
    }
    
}

package ej_5_nave;

/**
 *
 * 
 */
public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    
    //Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    // Metodos
    public void despegar(){
        if (combustible > 10){
         combustible -= 10;
    }else{
         System.out.println("No podemos despegar!! no hay suficiente combustible");
        }
    }
    
    public void avanzar(int distancia){ 
         if (combustible > (distancia*2)){
             combustible -= (distancia*2);
         }else{
             System.out.println("No podemos avanzar!! no hay suficiente combustible");
         }
        
    }
    
    public int recargarCombustible(int cantidad){
        return combustible += cantidad;
    }
    
}

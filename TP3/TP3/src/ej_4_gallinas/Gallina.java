package ej_4_gallinas;

/**
 *
 * 
 */
public class Gallina {
    
    //Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    //Constructor
    
    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    //Getters

    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
    //setters

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    
    
        //Metodos
    public int ponerHuevo(int cantidad){
        return huevosPuestos += cantidad;
    }
    
    public int envejecer() {
        
        return edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("id de la gallina :" + idGallina);
        System.out.println("edad :" + edad);
        System.out.println("Cantidad de huevos puestos :" + huevosPuestos);
    }
    
    
    
}

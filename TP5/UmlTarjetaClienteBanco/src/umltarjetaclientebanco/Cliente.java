/*
 * 
 */
package umltarjetaclientebanco;

/**
 *
 */

public class Cliente {
    private String nombre;
    private String dni;
    private Tarjeta tarjeta; // Asociación bidireccional
    
    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        
    }
    
    // Método para agregar tarjeta (mantiene la bidireccionalidad)
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta!= null && tarjeta.getCliente()!= this) {
            tarjeta.setCliente(this); // referencia bidireccional
        }
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    

    
 }

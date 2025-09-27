/*
 * 
 */
package umlcomputadoraplacapropietario;

/**
 *
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // Asociación bidireccional 1:1
    
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Método para asignar computadora (mantiene la bidireccionalidad)
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
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
    
    public Computadora getComputadora() {
        return computadora;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}

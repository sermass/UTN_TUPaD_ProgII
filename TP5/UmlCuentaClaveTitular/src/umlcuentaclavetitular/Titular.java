/*
 *
 */
package umlcuentaclavetitular;

/**
 *
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria; // Asociación bidireccional
    
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Método para asignar cuenta (mantiene la bidireccionalidad)
    public void asignarCuenta(CuentaBancaria cuenta) {
        
        this.cuentaBancaria = cuenta;
        
        // Establecer la relación bidireccional
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.asignarTitular(this);
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
    
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + ", cuentaBancaria=" + cuentaBancaria + '}';
    }
    
}


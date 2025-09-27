/*
 * 
 */
package umlvehiculoconductormotor;

/**
 *
 */
public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo; // Asociación bidireccional
    
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    
    // Método para asignar vehículo (mantiene la bidireccionalidad)
    public void setVehiculo(Vehiculo vehiculo) {
        // Remover la relación anterior si existe
        if (this.vehiculo != null) {
            this.vehiculo.setConductor(null);
        }
        
        this.vehiculo = vehiculo;
        
        // Establecer la relación bidireccional
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }
    
        
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getLicencia() {
        return licencia;
    }
    
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    @Override
    public String toString() {
        String infoVehiculo = vehiculo != null ? 
            vehiculo.getModelo() + " - " + vehiculo.getPatente() : "Ninguno";
        return "Conductor{nombre='" + nombre + "', licencia='" + licencia + 
               "', vehiculo=" + infoVehiculo + "}";
    }
}

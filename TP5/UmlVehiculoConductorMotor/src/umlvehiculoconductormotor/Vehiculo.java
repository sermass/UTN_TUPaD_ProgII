/*
 * 
 */
package umlvehiculoconductormotor;

/**
 *
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // Agregación
    private Conductor conductor; // Asociación bidireccional
    
    // Constructor con agregación de Motor
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // Agregación: el motor existe independientemente
    }
    
    // Método para asignar conductor (mantiene la bidireccionalidad)
    public void setConductor(Conductor conductor) {
        // Remover la relación anterior si existe
        if (this.conductor != null) {
            this.conductor.setVehiculo(null);
        }
        
        this.conductor = conductor;
        
        // Establecer la relación bidireccional
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
    // Método para cambiar motor (agregación)
    public void cambiarMotor(Motor nuevoMotor) {
        this.motor = nuevoMotor;
    }
    
    // Getters y Setters
    public String getPatente() {
        return patente;
    }
    
    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Motor getMotor() {
        return motor;
    }
    
    public Conductor getConductor() {
        return conductor;
    }
    
//    // Método para obtener información completa
//    public String obtenerInformacionCompleta() {
//        String infoMotor = motor != null ? motor.getTipo() + " - " + motor.getNumeroSerie() : "Sin motor";
//        String infoConductor = conductor != null ? conductor.getNombre() + " (" + conductor.getLicencia() + ")" : "Sin conductor";
//        
//        return "Vehiculo{patente='" + patente + 
//               "', modelo='" + modelo + 
//               "', motor=" + infoMotor + 
//               ", conductor=" + infoConductor + "}";
//    }
    
    @Override
    public String toString() {
        return "Vehiculo{patente='" + patente + "', modelo='" + modelo + "'}";
    }
}

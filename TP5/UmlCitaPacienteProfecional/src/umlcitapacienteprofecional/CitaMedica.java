/*
 * 
 */
package umlcitapacienteprofecional;

/**
 *
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;      // Asociación unidireccional CitaMédica → Paciente
    private Profesional profesional; // Asociación unidireccional CitaMédica → Profesional
    
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    // Método para asignar paciente (asociación unidireccional)
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
        // Unidireccional: el paciente no conoce la cita
    }
    
    // Método para asignar profesional (asociación unidireccional)
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
        // Unidireccional: el profesional no conoce la cita
    }
    
//    // Método para reprogramar cita
//    public void reprogramarCita(String nuevaFecha, String nuevaHora) {
//        this.fecha = nuevaFecha;
//        this.hora = nuevaHora;
//    }
//    
//    // Método para cancelar cita (liberar paciente y profesional)
//    public void cancelarCita() {
//        this.paciente = null;
//        this.profesional = null;
//    }
    
    // Método para verificar si la cita está completa
    public boolean citaCompleta() {
        return paciente != null && profesional != null;
    }
    
    // Método para obtener información de la cita
    public String obtenerInformacionCita() {
        String infoPaciente = paciente != null ? paciente.getNombre() + " (" + paciente.getObraSocial() + ")" : "Sin paciente";
        String infoProfesional = profesional != null ? profesional.getNombre() + " - " + profesional.getEspecialidad() : "Sin profesional";
        String estado = citaCompleta() ? "CONFIRMADA" : "PENDIENTE";
        
        return "Cita Medica - " + estado + 
               "\n  Fecha: " + fecha + 
               "\n  Hora: " + hora + 
               "\n  Paciente: " + infoPaciente + 
               "\n  Profesional: " + infoProfesional;
    }
    
    // Getters y Setters
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public Profesional getProfesional() {
        return profesional;
    }
    
    @Override
    public String toString() {
        return "CitaMedica{fecha='" + fecha + "', hora='" + hora + "'}";
    }
}

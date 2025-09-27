/*
 * 
 */
package umlreservamesacliente;

/**
 *
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación unidireccional (Reserva → Cliente)
    private Mesa mesa;       // Agregación (Reserva → Mesa)
    
    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    
    // Método para asignar cliente (asociación unidireccional)
    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
       
    }
    
    // Método para asignar mesa (agregación)
    public void asignarMesa(Mesa mesa) {
        this.mesa = mesa;
       
    }
    
    // Método para liberar mesa
    public void liberarMesa() {
        this.mesa = null;
    }
    
    // Método para liberar cliente
    public void liberarCliente() {
        this.cliente = null;
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
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Mesa getMesa() {
        return mesa;
    }
    
    // Método para obtener información completa de la reserva
    public String obtenerInformacionCompleta() {
        String infoCliente = cliente != null ? cliente.getNombre() : "Sin cliente";
        String infoMesa = mesa != null ? "Mesa " + mesa.getNumero() + " (cap. " + mesa.getCapacidad() + ")" : "Sin mesa";
        
        return "Reserva{fecha='" + fecha + 
               "', hora='" + hora + 
               "', cliente=" + infoCliente + 
               ", mesa=" + infoMesa + "}";
    }
    
    @Override
    public String toString() {
        return "Reserva{fecha='" + fecha + "', hora='" + hora + "'}";
    }
}

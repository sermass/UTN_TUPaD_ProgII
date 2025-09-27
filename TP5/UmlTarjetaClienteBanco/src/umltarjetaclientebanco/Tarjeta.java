/*
 *
 */
package umltarjetaclientebanco;

/**
 *
 */
public class Tarjeta {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco; // Agregación
    
    public Tarjeta(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco; // Agregación (el banco existe independientemente)
    }
    
    // Getters y Setters
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

        // Agregar al nuevo cliente
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
            if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }
    
    public Banco getBanco() {
        return banco;
    }
    
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", cliente=" + cliente + ", banco=" + banco + '}';
    }

   
}

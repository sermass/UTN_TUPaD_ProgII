/*
 * 
 */
package umlcuentaclavetitular;

/**
 *
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    
    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    // Método para validar clave
    public boolean validarClave(String codigoIngresado) {
        return this.codigo.equals(codigoIngresado);
    }
    
    // Método para cambiar clave
    public void cambiarClave(String nuevaClave, String fechaActual) {
        this.codigo = nuevaClave;
        this.ultimaModificacion = fechaActual;
    }
    
        
    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }
    
    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "ultimaModificacion=" + ultimaModificacion + '}';
    }
    
   
}

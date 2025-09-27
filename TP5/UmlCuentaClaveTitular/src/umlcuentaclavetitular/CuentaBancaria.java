/*
 * 
 */
package umlcuentaclavetitular;

/**
 *
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular titular; // Asociación bidireccional
    
    // Constructor con composición de ClaveSeguridad
    public CuentaBancaria(String cbu, double saldoInicial, String clave, String fechaActual) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        this.claveSeguridad = new ClaveSeguridad(clave, fechaActual); // Composición
    }
    
    // Método para asignar titular (mantiene la bidireccionalidad)
    public void asignarTitular(Titular titular) {
        
        this.titular = titular;
        
        // Establecer la relación bidireccional
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.asignarCuenta(this);
        }
    }
    
    // Método para realizar depósito
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }
    
    // Método para realizar extracción (con validación de clave)
    public boolean extraer(double monto, String clave) {
        if (monto <= 0 || monto > saldo || !claveSeguridad.validarClave(clave)) {
            return false;
        }
        this.saldo -= monto;
        return true;
    }
    
        
    // Método para consultar saldo (con validación de clave)
    public double consultarSaldo(String clave) {
        if (claveSeguridad.validarClave(clave)) {
            return saldo;
        }
        return -1; // Indica error de autenticación
    }
    
        
    // Método para cerrar cuenta (elimina la clave por composición)
    public void cerrarCuenta() {
        this.claveSeguridad = null; // Composición: la clave deja de existir
        this.asignarTitular(null); // Liberar la relación bidireccional
    }
    
    // Getters y Setters
    public String getCbu() {
        return cbu;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    // Metodo para obtener informacion completa de la cuenta
    public String obtenerInformacionCompleta() {
        String infoTitular = titular != null ? titular.getNombre() + " (" + titular.getDni() + ")" : "Sin titular";
        String estadoClave = claveSeguridad != null ? 
            claveSeguridad.toString() : "CUENTA CERRADA";
        
        return "CuentaBancaria{CBU='" + cbu + 
               "', saldo=$" + saldo + 
               ", titular=" + infoTitular + 
               ", claveSeguridad=" + estadoClave + "}";
    }
    
    @Override
    public String toString() {
        return "CuentaBancaria{CBU='" + cbu + "', saldo=$" + saldo + "}";
    }
}


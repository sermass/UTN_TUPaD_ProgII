/*
 * 
 */
package e_commerce;

/**
 *
 */
public class PagoConTarjeta implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;
    
    public PagoConTarjeta(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago con Tarjeta de Credito: " + montoConDescuento + " (Original: " + monto + ")");
        System.out.println("Procesando....");
        return true;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        // 5% de descuento para tarjetas de crédito
        return monto * 0.95;
    }
    
    // Getters
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    
    public String getTitular() {
        return titular;
    }
}

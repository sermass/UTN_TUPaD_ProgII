/*
 * 
 */
package e_commerce;

/**
 *
 */

public class PagoConPayPal implements Pago {
    private String email;
    
    public PagoConPayPal(String email) {
        this.email = email;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: " + monto);
        System.out.println("Procesando...");
        return true;
    }
    
    // Getter
    public String getEmail() {
        return email;
    }
}

/*
 * 
 */
package e_commerce;

/**
 *
 */

public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}
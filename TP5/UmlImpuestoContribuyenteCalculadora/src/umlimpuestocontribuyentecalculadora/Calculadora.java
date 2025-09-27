/*
 * 
 */
package umlimpuestocontribuyentecalculadora;

/**
 *
 */
public class Calculadora {
    
    // Dependencia de uso: el método recibe un Impuesto como parámetro
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto...");
        System.out.println("Monto: $" + impuesto.getMonto());
        
        if (impuesto.getContribuyente() != null) {
            System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        }
    }
}


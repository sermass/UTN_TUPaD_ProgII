/*
 * 
 */
package umlimpuestocontribuyentecalculadora;

/**
 *
 */
public class UmlImpuestoContribuyenteCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear contribuyente
        Contribuyente contribuyente1 = new Contribuyente("Juan", "20123456789");
        
        // Crear impuesto con asociación al contribuyente
        Impuesto impuesto = new Impuesto(15000.0, contribuyente1);
        
        // Crear calculadora
        Calculadora calculadora = new Calculadora();
        
        // Usar dependencia de uso: la calculadora recibe el impuesto como parámetro
        calculadora.calcular(impuesto);
    }
}


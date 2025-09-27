/*
 * 
 */
package umltarjetaclientebanco;

/**
 *
 */
public class UmlTarjetaClienteBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear banco (agregación)
        Banco bancoSantan = new Banco("Santan", "30655577789");
        Banco bancoGali = new Banco("Gali", "30333344541");
        
        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "12345678");
        Cliente cliente2 = new Cliente("Maria", "87654321");
       
        
        // Crea tarjetas
        Tarjeta tarjeta1 = new Tarjeta(
            "1234567890", 
            "2025-12-31", 
            bancoSantan
        );
        
        Tarjeta tarjeta2 = new Tarjeta(
            "987654327654", 
            "2026-06-30", 
            bancoGali
        );
        
        // Establecer relaciones bidireccionales
        cliente1.setTarjeta(tarjeta1);
        cliente2.setTarjeta(tarjeta2);
        
        // Mostrar información
        System.out.println("cliente: " + cliente2.getNombre() + " Dni: " + cliente2.getDni());
        System.out.println("Tarjeta: " + cliente2.getTarjeta() );
       
        System.out.println("Tarjeta del " + cliente1 + " del banco: " + cliente1.getTarjeta().getBanco());
   }
    
    
}

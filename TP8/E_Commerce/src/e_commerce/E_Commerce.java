/*
*
*/
package e_commerce;

/**
 *
 */
public class E_Commerce {

    /**
     * 
     */
    public static void main(String[] args) {
        
        // Crear cliente
        Cliente cliente = new Cliente("Juan Perez", "juan@email.com.ar");
        
        // Crear productos
        Producto laptop = new Producto("Laptop Gaming", 1200.00);
        Producto mouse = new Producto("Mouse Inalambrico", 45.50);
        Producto teclado = new Producto("Teclado Mecanico", 89.99);
        
        // Crear pedido
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(laptop);
        pedido.agregarProducto(mouse);
        pedido.agregarProducto(teclado);
        
        System.out.println("");
        System.out.println("=== SISTEMA DE PAGOS ===");
        System.out.println("Pedido creado: " + pedido);
        System.out.println("");
        System.out.println("Productos en el pedido: ");
        pedido.getProductos().forEach(System.out::println);
        
        // Procesar pagos
        System.out.println("");
        System.out.println("=== PROCESANDO PAGOS ===");
        
        // Pago con Tarjeta de Credito (con descuento)
        PagoConTarjeta tarjeta = new PagoConTarjeta("1234-5678-9012-3456", "Juan Perez");
        double totalPedido = pedido.calcularTotal();
        tarjeta.procesarPago(totalPedido);
        
        // Pago con PayPal
        PagoConPayPal paypal = new PagoConPayPal("juan@email.com");
        paypal.procesarPago(totalPedido);
        
        // Cambios de estado del pedido (notificaciones automáticas)
        System.out.println("");
        System.out.println("=== NOTIFICACIONES DE ESTADO ===");
        pedido.cambiarEstado("CONFIRMADO");
        System.out.println("");
        
        pedido.cambiarEstado("EN PREPARACION");
        System.out.println("");
        
        pedido.cambiarEstado("ENVIADO");
        System.out.println("");
        
        pedido.cambiarEstado("ENTREGADO");
    }
}
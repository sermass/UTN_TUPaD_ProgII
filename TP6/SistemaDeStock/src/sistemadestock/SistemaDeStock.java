/*
 * 
 */
package sistemadestock;

/**
 *
 */
public class SistemaDeStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto prod1 = new Producto("prod 1", "Manteca", 1200.0, 3, CategoriaProducto.ALIMENTOS);
        Producto prod2 = new Producto("prod 2", "Remera", 1400.0, 2, CategoriaProducto.ROPA);

        Inventario inv = new Inventario();
        
        inv.listarProductos();
        inv.agregarProducto(prod2);
        inv.agregarProducto(new Producto("prod 3", "Telefono", 30000, 1, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(prod1);
        inv.agregarProducto(new Producto("prod 4", "Licuadora", 35000, 1, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("prod 5", "Crema", 3000, 3, CategoriaProducto.ALIMENTOS));
        System.out.println("");
        inv.listarProductos();
        System.out.println("");
       
        System.out.println("Busco el producto con id: 'prod 1'");
        Producto pBuscado = inv.buscarProductoPorId("prod 1");

        pBuscado.mostrarInfo(pBuscado);

        System.out.println("");
        System.out.println("Filtro por categoria alimentos");
        inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("");
        System.out.println("Elimino un prod por su id");
        Producto eliminado = inv.eliminarProducto("prod 1");
        System.out.println("Se Borro: " + eliminado);
        System.out.println("");
        inv.listarProductos();
        
        System.out.println("");
        System.out.println("Se actualiza el stock de prod 3. Ahora son 5 Telefonos en stock");
        inv.actualizarStock("prod 3", 5);
        inv.listarProductos();
        
        System.out.println("");
        System.out.println("Se obtiene el stock total");
        System.out.println("El stock total es: " + inv.obtenerTotalStock());
       
        System.out.println("");
        System.out.println("Producto con mayor stock");
        System.out.println("El producto con mayor stock es: " + inv.obtenerProductoConMayorStock());
       
        System.out.println("");
        System.out.println("Filtrar productos entre 1000 y 3000");
        System.out.println("Los productos entre esos precios son: " + inv.filtrarProductosPorPrecio(1000, 3000));

        System.out.println("");
        inv.mostrarCategoriasDisponibles();

        
        
        
      
    }

   
    
}

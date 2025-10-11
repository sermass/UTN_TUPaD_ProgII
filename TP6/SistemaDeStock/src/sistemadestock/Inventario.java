/*
 * 
 */
package sistemadestock;

import java.util.ArrayList;

/**
 *
 */
public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        //Sumo la cantidad  agregada al stock existente (si hay) y sino agrego el producto
        if (buscarProductoPorId(p.getId()) != null) {
            actualizarStock(p.getId(), p.getCantidad());
        }else{
            this.productos.add(p);
        }
    }

    
    public void listarProductos() {
        for (Producto producto : productos) {
            producto.mostrarInfo(producto);
        }
    }
    

    
    public Producto buscarProductoPorId(String id) {
        Producto productoBuscado = null;
        int i = 0;
        while (i < productos.size() && productoBuscado == null) {
            if (productos.get(i).getId().equals(id)) {
                productoBuscado = productos.get(i);
            }
            i++;
        }
        return productoBuscado;
    }

    public Producto eliminarProducto(String id) {
        Producto prodABorrar = buscarProductoPorId(id);
        this.productos.remove(prodABorrar);
        
        return prodABorrar;
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        // si existe el id actualizo
        if(buscarProductoPorId(id) != null){            
             buscarProductoPorId(id).setCantidad(nuevaCantidad);
        }else{
            System.out.println("No existe el id");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto producto : productos) {
            if(producto.getCategoria() == categoria){
               producto.mostrarInfo(producto);
            }
        }

    }

    public int obtenerTotalStock() {
        //Total de stock = suma de los stocks de todos los productos
        int suma = 0;
        for (Producto producto : productos) {
            suma += producto.getCantidad();
        }
        return suma;
    }

    public Producto obtenerProductoConMayorStock() {
        int mayor = 0;
        Producto productoMasStock = null;
        for (Producto producto : productos) {
            if (producto.getCantidad() > mayor) {
                mayor = producto.getCantidad();
                productoMasStock = producto;
            }
        }
        return productoMasStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosEncontrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio()<= max &&  producto.getPrecio()>= min) {
                System.out.println(producto.getPrecio());
                productosEncontrados.add(producto);
            } 
        }
        return productosEncontrados;

    }

    public void mostrarCategoriasDisponibles() {
       CategoriaProducto[] categorias = CategoriaProducto.values();
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ") " +
                categorias[i].name() +  ": " +
                categorias[i].getDescripcion());
            
        }
    }

}

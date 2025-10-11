/*
 * 
 */
package sistemadestock;

/**
 *
 */
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
  
    
    
    public void mostrarInfo(Producto p) {
        System.out.println(
                "Nombre: " + p.nombre + 
                " Id: " + p.id + 
                " precio: $" + p.precio + 
                " cantidad en stock: " + p.cantidad +
                " categoria: " + p.categoria);
        
        
    }
            
            
}

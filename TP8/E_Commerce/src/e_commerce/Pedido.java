/*
 * 
 */
package e_commerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;
    
    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void removerProducto(Producto producto) {
        productos.remove(producto);
    }
    
    @Override
    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::calcularTotal)
                .sum();
    }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificarCambioEstado(this, nuevoEstado);
        }
    }
    
    // Getters
    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }
    
    public String getEstado() {
        return estado;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Pedido{" + "productos=" + productos + ", estado=" + estado + ", cliente=" + cliente + '}';
    }
    
   
}
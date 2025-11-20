/*
 * 
 */
package e_commerce;

/**
 *
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;
    
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificarCambioEstado(Pedido pedido, String nuevoEstado) {
        System.out.println("Notificacion para " + nombre + email + ": ");
        System.out.println("El estado de tu pedido cambio a: " +  nuevoEstado);
        System.out.println("Pedido total: " + pedido.calcularTotal());
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", email=" + email + '}';
    }
    
    
}

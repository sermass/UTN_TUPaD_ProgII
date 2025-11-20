/*
 * 
 */
package e_commerce;

/*
 *
 */

public interface Notificable {
    void notificarCambioEstado(Pedido pedido, String nuevoEstado);
}

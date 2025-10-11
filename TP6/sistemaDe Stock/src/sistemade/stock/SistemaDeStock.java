/*
 *
 */
package sistemade.stock;

import static sistemade.stock.CategoriaProducto.ALIMENTOS;

/**
 *
 */
public class SistemaDeStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        agregarProducto("AB1", "manteca", 1200.0, 10, ALIMENTOS)
        
        Producto prod1 = new Producto("AB1", "manteca", 1200.0, 10, ALIMENTOS);
    }
    
}

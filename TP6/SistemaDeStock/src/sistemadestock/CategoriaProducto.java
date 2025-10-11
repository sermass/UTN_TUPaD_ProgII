/*
 * 
 */
package sistemadestock;

/**
 *
 */
public enum CategoriaProducto {
    
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electronicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Articulos para el hogar");

    private final String descripcion;
    
    

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "CategoriaProducto{" + "descripcion=" + descripcion + '}';
    }
    
    
}

/*
 *
 */
package kata_figurasgeometricas;

/**
 *
 */
public abstract class Figura {
    String nombre;
    public abstract double calcularArea();

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    
}

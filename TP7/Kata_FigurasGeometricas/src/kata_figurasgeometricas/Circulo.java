/*
 *
 */
package kata_figurasgeometricas;

/**
 *
 */
public class Circulo extends Figura{
        private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    
    @Override
    public double calcularArea() {
        final double PI = 3.14;
        return PI * radio * radio;
        
    }

    
    
        
        
    
}

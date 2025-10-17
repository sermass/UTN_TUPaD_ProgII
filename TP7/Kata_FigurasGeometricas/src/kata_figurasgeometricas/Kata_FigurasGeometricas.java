/*
 * 
 */
package kata_figurasgeometricas;

import java.util.ArrayList;

/**
 *
 */
public class Kata_FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ceo el array de figuras 
        ArrayList<Figura> fig = new ArrayList<>();
        fig.add(new Rectangulo(2,3,"R1"));
        fig.add( new Circulo(3,"C1"));
        fig.add(new Rectangulo(4.1,1.5,"R2"));
        fig.add( new Circulo(2,"C2"));
        fig.add( new Rectangulo(3,3,"R3"));
        
        for (int i = 0; i < fig.size(); i++) {
            System.out.println("Area de la figura (" + fig.get(i).nombre + ") = " + fig.get(i).calcularArea() );
            System.out.println("");
        }
        
        
    }
    
}

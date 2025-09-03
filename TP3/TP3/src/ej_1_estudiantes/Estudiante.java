
package ej_1_estudiantes;
/**
 *
 *
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;
 
    // Metodos
    
    void mostrarInfo(){
        System.out.println(apellido + " " + nombre + " " + curso + " " + apellido + " " + calificacion);
    }
    
    double subirCalificacion(double puntos){
        return calificacion += puntos;
    }
    
    double bajarCalificacion(double puntos){
        return calificacion -= puntos;
    }
}
   

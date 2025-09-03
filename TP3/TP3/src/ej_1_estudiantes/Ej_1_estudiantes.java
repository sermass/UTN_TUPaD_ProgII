package ej_1_estudiantes;

/**
 *
 *
 */
public class Ej_1_estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante estu = new Estudiante();
        estu.nombre = "Ser";
        estu.apellido = "Mass";
        estu.curso = "3A";
        estu.calificacion = 7;
        
        
        estu.mostrarInfo();
        estu.subirCalificacion(2.1);
        estu.mostrarInfo();
        estu.bajarCalificacion(2.1);
         estu.mostrarInfo();
    }
    
    
    
}

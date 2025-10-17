/*
 * 
 */
package kata_empleados;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Kata_Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crear lista de empleados
        List<Empleado> empleados = new ArrayList<>();
        
        // Agregar empleados de diferentes tipos
        empleados.add(new EmpleadoPlanta(10, true, "Juan", "Perez" , 101, 1500));
        empleados.add(new EmpleadoTemporal(3, "Maria", "Garcia", 102, 1000));
        empleados.add(new EmpleadoPlanta(5, true, "Carlos", "Lopez", 104, 1500));
        empleados.add(new EmpleadoTemporal(15, "Pedro", "Rodriguez", 105, 1000));
        empleados.add(new EmpleadoPlanta(15, false, "Juana", "Martinez" , 103, 1500));
    
    
     for(Empleado empleado: empleados) {
    int contadorPlanta = 0;
    int contadorTemporal=0;
    if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
                EmpleadoPlanta planta = (EmpleadoPlanta) empleado;         
                System.out.println(((EmpleadoPlanta) empleado).nombre + " " +
                        ((EmpleadoPlanta) empleado).apellido + " legajo: " +
                        ((EmpleadoPlanta) empleado).legajo + 
                        " EMPLEADO DE PLANTA");
                System.out.println("Anios de antiguedad: " + planta.getAntiguedad());
                System.out.println("");
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
                EmpleadoTemporal temporal = (EmpleadoTemporal) empleado;
                System.out.println(((EmpleadoTemporal) empleado).nombre + " " +
                        ((EmpleadoTemporal) empleado).apellido + " legajo: " +
                        ((EmpleadoTemporal) empleado).legajo + "EMPLEADO TEMPORAL");
                System.out.println("Horas extras trabajadas: " + temporal.getHorasExtras());
                System.out.println("");
            }
}
    
}
    
    
}

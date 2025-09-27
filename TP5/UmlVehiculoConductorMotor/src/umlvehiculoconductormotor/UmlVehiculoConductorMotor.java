/*
 * 
 */
package umlvehiculoconductormotor;

/**
 *
 */
public class UmlVehiculoConductorMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Crear motores (agregación - existen independientemente)
        Motor motor1 = new Motor("V8", "MOT-001");
        Motor motor2 = new Motor("V6", "MOT-002");
        
         // Crear conductores
        Conductor conductor1 = new Conductor("Carlos", "12345");
        Conductor conductor2 = new Conductor("Ana", "67890");
        
         // Crear vehículos con agregación de motores
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", motor1);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Ford", motor2);
        
        System.out.println("Antes de asignar conductores:");
        System.out.println("Conductor 1: " + conductor1);
        System.out.println("Conductor 2: " + conductor2);
        
         // Asignar conductores a vehículos (relación bidireccional)
        conductor1.setVehiculo(vehiculo1);
        conductor2.setVehiculo(vehiculo2);
        
        System.out.println("");
        System.out.println("Despues de asignar conductores:");
        System.out.println("Conductor 1: " + conductor1);
        System.out.println("Conductor 2: " + conductor2);
        
        //bidireccionalidad
        System.out.println("");
        System.out.println("Desde vehiculo1: conductor= " + vehiculo1.getConductor().getNombre());
        System.out.println("Desde conductor1: vehiculo= " + conductor1.getVehiculo().getModelo());
        
    }
    
}

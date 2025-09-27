/*
 * 
 */
package umlreservamesacliente;

/**
 *
 */
public class UmlReservaMesaCliente {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
              
        // Crear clientes
        Cliente cliente1 = new Cliente("Maria", "11-1234");
        Cliente cliente2 = new Cliente("Juan", "11-8765");
        Cliente cliente3 = new Cliente("Ana", "11-5555");
        
        System.out.println("Clientes creados:");
        System.out.println("1. " + cliente1);
        System.out.println("2. " + cliente2);
        System.out.println("3. " + cliente3);
        
        // Crear mesas (agregación - existen independientemente)
        Mesa mesa1 = new Mesa(1, 4);
        Mesa mesa2 = new Mesa(2, 6);
        Mesa mesa3 = new Mesa(3, 2);
        Mesa mesa4 = new Mesa(4, 8);
        
        System.out.println("\nMesas creadas:");
        System.out.println("1. " + mesa1);
        System.out.println("2. " + mesa2);
        System.out.println("3. " + mesa3);
        System.out.println("4. " + mesa4);
        
                
        // Crear reservas
        Reserva reserva1 = new Reserva("12-5", "20:00");
        Reserva reserva2 = new Reserva("12-5", "21:30");
        Reserva reserva3 = new Reserva("1-6", "19:00");
        
        System.out.println("Reservas creadas:");
        System.out.println("1. " + reserva1);
        System.out.println("2. " + reserva2);
        System.out.println("3. " + reserva3);
        
                
        // Asignar clientes y mesas a las reservas
        reserva1.asignarCliente(cliente1);
        reserva1.asignarMesa(mesa2);
        
        reserva2.asignarCliente(cliente2);
        reserva2.asignarMesa(mesa1);
        
        reserva3.asignarCliente(cliente3);
        reserva3.asignarMesa(mesa4);
        
        System.out.println("Reservas despues de las asignaciones:");
        System.out.println("1. " + reserva1.obtenerInformacionCompleta());
        System.out.println("2. " + reserva2.obtenerInformacionCompleta());
        System.out.println("3. " + reserva3.obtenerInformacionCompleta());
        
                
               
        // Cancelar una reserva (liberar cliente y mesa)
        reserva2.liberarCliente();
        reserva2.liberarMesa();
        
        System.out.println("Reserva 2 cancelada: " + reserva2.obtenerInformacionCompleta());
        
       
        
        //unidireccional: la Reserva conoce al Cliente pero no viceversa
        System.out.println("Cliente de reserva1: " + reserva1.getCliente().getNombre());
        System.out.println("Mesa de reserva1: " + reserva1.getMesa());
        
        // agregación: las mesas existen independientemente de las reservas
        System.out.println("\nMesas disponibles independientemente de reservas:");
        System.out.println("Mesa 3: " + mesa3 + " (no asignada a ninguna reserva)");
        System.out.println("Mesa 1: " + mesa1 + " (liberada de reserva2)");
    }
}
    
  


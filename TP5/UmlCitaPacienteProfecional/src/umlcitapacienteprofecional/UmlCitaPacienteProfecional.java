/*
 * 
 */
package umlcitapacienteprofecional;

/**
 *
 */

public class UmlCitaPacienteProfecional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        // Crear pacientes
        Paciente paciente1 = new Paciente("Ana", "OSDE");
        Paciente paciente2 = new Paciente("Carlos", "Swiss Medical");
        Paciente paciente3 = new Paciente("Maria", "Galeno");
                
        System.out.println("Pacientes creados:");
        System.out.println("1. " + paciente1);
        System.out.println("2. " + paciente2);
        System.out.println("3. " + paciente3);
        
        
        // Crear profesionales
        Profesional profesional1 = new Profesional("Dr. Orson", "Cardiologia");
        Profesional profesional2 = new Profesional("Dra. Wels", "Pediatria");
        Profesional profesional3 = new Profesional("Dr. Ruiz", "Traumatologia");
 
        
        System.out.println("\nProfesionales creados:");
        System.out.println("1. " + profesional1);
        System.out.println("2. " + profesional2);
        System.out.println("3. " + profesional3);
        
        
        // Crear citas médicas
        CitaMedica cita1 = new CitaMedica("1-10", "10:00");
        CitaMedica cita2 = new CitaMedica("12-9", "11:30");
        CitaMedica cita3 = new CitaMedica("22-11", "09:00");
        
        
        System.out.println("Citas creadas (inicialmente vacias):");
        System.out.println("1. " + cita1.obtenerInformacionCita() + "\n" );
        System.out.println("2. " + cita2.obtenerInformacionCita() + "\n" );
        System.out.println("3. " + cita3.obtenerInformacionCita() + "\n" );
               
               
        // Asignar pacientes y profesionales a las citas (unidireccional)
        cita1.setPaciente(paciente1);
        cita1.setProfesional(profesional1);
        
        cita2.setPaciente(paciente2);
        cita2.setProfesional(profesional2);
        
        cita3.setPaciente(paciente3);
        cita3.setProfesional(profesional3);
        
        System.out.println("Despues de setear pacientes y profesionales:");
        System.out.println("1. " + cita1.obtenerInformacionCita() + "\n" );
        System.out.println("2. " + cita2.obtenerInformacionCita() + "\n" );
        System.out.println("3. " + cita3.obtenerInformacionCita() + "\n" );
        
        
       
        
        // Verificar estado de las citas
        System.out.println("Cita 1 completa: " + cita1.citaCompleta());
        System.out.println("Cita 2 completa: " + cita2.citaCompleta());
        System.out.println("Cita 3 completa: " + cita3.citaCompleta());
        
        
        
        
        // Demostrar que la relación es unidireccional
        System.out.println("Desde cita1 podemos acceder al paciente: " + cita1.getPaciente().getNombre());
        System.out.println("Desde cita1 podemos acceder al profesional: " + cita1.getProfesional().getNombre());
        
        // Pero el paciente y profesional no conocen la cita (unidireccional)
        System.out.println("El paciente1 existe independientemente: " + paciente1);
        System.out.println("El profesional1 existe independientemente: " + profesional1);
        
}
    }
    

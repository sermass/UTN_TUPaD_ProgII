/*
 * 
 */

/**
 *
 */
public class GestionUniversitaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo la universidad
        Universidad uni1 = new Universidad("Lilliput");
        
        // 1-) Creo 3 profesores
        Profesor profe1 = new Profesor("P1", "Juan", "Matematica");
        Profesor profe2 = new Profesor("P2", "Andrea", "Programacion");
        Profesor profe3 = new Profesor("P3", "Pablo", "Ingles");
        
         //Creo 5 cursos
        Curso curso1 = new Curso("C1", "Matematica 1");
        Curso curso2 = new Curso("C2", "Programacion 1");
        Curso curso3 = new Curso("C3", "Ingles 1");
        Curso curso4 = new Curso("C4","Probabilidad 1");
        Curso curso5 = new Curso("C5", "Base de datos");
        
        //2-)agrego los 3 profesores a la universidad
        uni1.agregarProfesor(profe1);
        uni1.agregarProfesor(profe2);
        uni1.agregarProfesor(profe3);
        
                
        uni1.agregarCurso(curso1);
        uni1.agregarCurso(curso2);
        uni1.agregarCurso(curso3);
        uni1.agregarCurso(curso4);
        uni1.agregarCurso(curso5);
        
        //3-) Asigno  profesores a los cursos
        uni1.asignarProfesorACurso("C1", "P1");
        uni1.asignarProfesorACurso("C2", "P2");
        uni1.asignarProfesorACurso("C3", "P3");
        uni1.asignarProfesorACurso("C4", "P1");
        uni1.asignarProfesorACurso("C5", "P2");
        
        //4-) Listado de profesores y cursos
        System.out.println("");
        System.out.println("-Listado de cursos");
        uni1.listarCursos();
        
        System.out.println("");
        System.out.println("-Listado de profesores");
        uni1.listarProfesores();
        
        //8-) Mostrar cursos por profesor
        System.out.println("");
        System.out.println("-Cursos por profesor");
        for (Profesor profesor : uni1.getProfesores()) {
            System.out.println(profesor.getNombre() +":");
            profesor.listarCursos();
            System.out.println("");
        }
        
        //6-) Elimino un curso
        System.out.println("");
        uni1.eliminarCurso("C4");
        System.out.println("");
        System.out.println("-Nuevo listado de cursos");
        uni1.listarCursos();
        System.out.println("");
        System.out.println("-Cursos por profesor");
        for (Profesor profesor : uni1.getProfesores()) {
            System.out.println(profesor.getNombre() +":");
            profesor.listarCursos();
            System.out.println("");
        }
        
        //5-) cambio de profesor de un curso
        System.out.println("");
        System.out.println("Cambio de profesor de un curso");
        System.out.println("Estado anterior al cambio: ");
        System.out.println("El profesor/a " + profe1.getNombre() + " tiene " + profe1.getCursos().size() + " cursos");
        System.out.println("El profesor/a " + profe2.getNombre() + " tiene " + profe2.getCursos().size() + " cursos");
        
        uni1.asignarProfesorACurso("C2", "P1");
        System.out.println("");
        System.out.println("Estado posterior al cambio: ");
        System.out.println("El profesor/a " + profe1.getNombre() + " tiene " + profe1.getCursos().size() + " cursos");
        System.out.println("El profesor/a " + profe2.getNombre() + " tiene " + profe2.getCursos().size() + " cursos");
        
        System.out.println("");
        System.out.println("-Cursos por profesor");
        for (Profesor profesor : uni1.getProfesores()) {
            System.out.println(profesor.getNombre() +":");
            profesor.listarCursos();
            System.out.println("");
        }
        
        System.out.println("Estado antes de la remocion:");
        System.out.println("Profesor: " + profe1.getNombre() + " Tiene: " + profe1.getCursos().size() + " cursos");
        System.out.println("Curso " + curso1.getNombre() + " tiene " + curso1.getProfesor().getNombre());
        
        //7-) Remover el profesor
        uni1.eliminarProfesor("P1");
        System.out.println("");
        System.out.println("Estado despues de la remocion:");
        System.out.println("");
        System.out.println("-Listado de profesores");
        uni1.listarProfesores();
         System.out.println("");
        System.out.println("-Cursos por profesor");
        for (Profesor profesor : uni1.getProfesores()) {
            System.out.println(profesor.getNombre() +":");
            profesor.listarCursos();
            System.out.println("");
        }
        System.out.println("El curso que dictaba el profesor eliminado quedo en null:");
        System.out.println(curso1.getNombre() + ": profesor " +curso1.getProfesor());
    }
    
}

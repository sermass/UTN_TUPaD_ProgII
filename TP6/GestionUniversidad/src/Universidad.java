
import java.util.ArrayList;
import java.util.List;


/*
 *
 */

/**
 *
 */
public class Universidad {

    private String nombre;
    private ArrayList<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>() ;
        this.cursos = new ArrayList<>();
    }
    
     public void agregarProfesor(Profesor p) {
        if(!profesores.contains(p)){
            this.profesores.add(p);
        }        
    }

    public void agregarCurso(Curso c) {
        if(!cursos.contains(c)){
            this.cursos.add(c);
        }      
    }
    
     public void listarProfesores() {
         for (Profesor profesor : profesores) {
             profesor.mostrarInfo();
         }

    }
    
     

    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

   
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        //→ Usa setProfesor del curso.
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        } else {
            System.out.println("Error: Curso o profesor no encontrado");
        }
    }


    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;

    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;

    }

    public void eliminarCurso(String codigo) {
        //→ Debe romper la relación con su profesor si la hubiera.
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper relación con el profesor
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso eliminado: " + codigo);
        } else {
            System.out.println("Curso no encontrado: " + codigo);
        }
    }

    public void eliminarProfesor(String id) {
        //→ Antes de remover, dejar null los cursos que dictaba.
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar null en los cursos que dictaba
            ArrayList<Curso> cursosDeProfe = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDeProfe) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor eliminado: " + id);
        } else {
            System.out.println("Profesor no encontrado: " + id);
        }
    }
     
     //Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

}

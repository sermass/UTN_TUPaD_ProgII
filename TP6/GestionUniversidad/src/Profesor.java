
import java.util.ArrayList;
import java.util.List;



/*
 * 
 */

/**
 *
 */
public class Profesor {

    private String id; // (String) → Identificador único.
    private String nombre; // (String) → Nombre completo.
    private String especialidad; // (String) → Área principal.
    private List<Curso> cursos; //List<Curso> → Cursos que dicta.

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
     public void agregarCurso(Curso c) {
        //→ Agrega el curso a su lista si no está y sincroniza el lado del curso.

        if (!this.cursos.contains(c)) {
            this.cursos.add(c);

            // Asegurar la consistencia bidireccional
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }
     
    public void eliminarCurso(Curso c) {
        //→ Quita el curso y sincroniza el lado del curso (dejar profesor en null si corresponde).
        if (cursos.remove(c)) {
            // Sincronizar el lado del curso
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    
    }

    public void listarCursos() {
        //→ Muestra códigos y nombres.
        for (Curso curso : cursos) {
            System.out.println(curso.getNombre());
        }
    }

               
    public void mostrarInfo() {
        //→ Imprime datos del profesor y cantidad de cursos.
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

}

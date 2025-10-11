/*
 * 
 */

/**
 *
 */
public class Curso {

    private String codigo; // → Código único.
    private String nombre; // → Nombre del curso.
    private Profesor profesor; //profesor responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public void setProfesor(Profesor p) {

        /* → Asigna/cambia el profesor sincronizando ambos lados:
         * Si tenía profesor previo, quitarse de su lista.
         */
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        this.profesor = p;

        if (p != null) {
            p.agregarCurso(this);
        }

    }

  
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
   }

    public Profesor getProfesor() {
        return profesor;
    }
        

    public void mostrarInfo() {
        //→ Muestra código, nombre y nombre del profesor (si tiene).
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
    }

      
}

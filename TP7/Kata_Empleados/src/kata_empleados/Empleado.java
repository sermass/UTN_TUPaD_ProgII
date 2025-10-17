/*
 * 
 */
package kata_empleados;

/**
 *
 */
public abstract class Empleado {

    String nombre;
    String apellido;
    int legajo;
    double sueldoBase;

    public Empleado(String nombre, String apellido, int legajo, double sueldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + '}';
    }
    
    

    public abstract double calcularSueldo();

}

/*
 * 
 */
package kata_empleados;

/**
 *
 */
public class EmpleadoPlanta extends Empleado{
    final double PORCENTAJEaNTIG = 0.05;
    final double BONOPRESENTIS = 500;
    int antiguedad;
    boolean presentismo;

    public EmpleadoPlanta(double antiguedad, boolean presentismo, String nombre, String apellido, int legajo, double sueldoBase) {
        super(nombre, apellido, legajo, sueldoBase);
        this.antiguedad = (int) antiguedad;
        this.presentismo = presentismo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    
    

    @Override
    public double calcularSueldo() {
        return getSueldoBase()*PORCENTAJEaNTIG*antiguedad + (presentismo ? BONOPRESENTIS: 0);
    }
    
    
}

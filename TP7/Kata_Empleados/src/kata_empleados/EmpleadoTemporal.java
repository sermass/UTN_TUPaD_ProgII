/*
 * 
 */
package kata_empleados;

/**
 *
 */
public class EmpleadoTemporal extends Empleado{
    final double VALOReXTRA = 100;
    private int horasExtras;

    public EmpleadoTemporal(int horasExtras, String nombre, String apellido, int legajo, double sueldoBase) {
        super(nombre, apellido, legajo, sueldoBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() + (horasExtras * VALOReXTRA);
    }

    public int getHorasExtras() {
        return horasExtras;
    }
    
    
     
}

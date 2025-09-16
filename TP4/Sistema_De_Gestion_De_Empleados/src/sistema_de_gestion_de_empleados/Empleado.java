/*
 * 
 */
package sistema_de_gestion_de_empleados;

/**
 *
 * 
 */
public class Empleado {
   
    private static int contador;   //: contador de clase para los id auto generados 
    private int id;         //: Identificador único del empleado.
    private String nombre;  //: Nombre completo.
    private String puesto;  //: Cargo que desempeña.
    private double salario; //: Salario actual.
    private static int totalEmpleados = 0; //: Contador global de empleados creados.

    
    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) { 
        Empleado.totalEmpleados ++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        
    }

     // Constructor con id autogenerado y salario por defecto
    public Empleado(String nombre, String puesto) {
        Empleado.contador ++; // cada vez que se agrega un empleado se suma 1 al contador         
        this(Empleado.contador, nombre, puesto, 700);
    }
    
    
    /*
    * El enunciado pide:
    *   Métodos sobrecargados actualizarSalario:
    *    ○ Uno que reciba un porcentaje de aumento.
    *    ○ Otro que reciba una cantidad fija a aumentar
    * El metodo sobrecargado solo utiliza un parametro. Para que java distinga
    * que metodo usar en que caso cambio el tipo de variable como parametro.
    * Asi para usar: porcentajes debe ser entero
    *                para monto fijo decimal
    *
    ****************************************************************
    * Se podria haber hecho con dos parametros y poniendo 0 al segundo:
    * public void actualizarSalario(double porcentaje, double MontoFijo) {
    *    this.salario += this.salario * porcentaje / 100 + MontoFijo;
    *
    * y la sobrecarga 
    * public void actualizarSalario(double MontoFijo) {
    *    actualizarSalario(0, MontoFijo)
    */
    
    
     // metodo que actualiza salario con porcentaje (int)
    public void actualizarSalario(int porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    // metodo que actualiza salario con monto fijo (double)
    public void actualizarSalario(double MontoFijo) {
        this.salario += MontoFijo;
    }
    
    // metodo estatico que muestra la cantidad de empleados en este momento
    public static void mostrarTotalEmpleados(){
        System.out.println("Total de empleados ingresados: " +Empleado.totalEmpleados);
    }
    
    
    //Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public void setPuesto(String puesto) {
        if (puesto != null) {
            this.puesto = puesto;
        }
        
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
       
    }
    
    
        

    //Metodo toString
    @Override
    public String toString() {
        return "Empleado{" 
                + "id= " + id 
                + ", nombre= " + nombre 
                + ", puesto= " + puesto 
                + ", salario= " + salario 
                + '}';
    }
    
    
}

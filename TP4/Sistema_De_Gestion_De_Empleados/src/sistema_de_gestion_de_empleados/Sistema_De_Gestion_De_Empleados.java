/*
 * 
 */
package sistema_de_gestion_de_empleados;

/**
 *
 * 
 */
public class Sistema_De_Gestion_De_Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Instancio 2 empleados con contructor completo
        Empleado emp1 = new Empleado(1, "Maria", "tester", 2);
        Empleado emp2 = new Empleado(2, "Juan", "prog", 0);
        
        //Instancio 2 empleados con contructor sobrecargado
        Empleado emp3 = new Empleado("Jorge", "admin");
        Empleado emp4 = new Empleado("Sergio", "finanzas");
        
        System.out.println("Instanciados con constructor completo");
        System.out.println(emp1);
        System.out.println(emp2);
        
        System.out.println("\nInstanciados con sobrecarga de constructor");
        System.out.println(emp3);
        System.out.println(emp4);
      
        System.out.println("\nActualizacion de salario metodo monto fijo");
        emp1.actualizarSalario(300.00);
        emp4.actualizarSalario(100.00);
        emp2.actualizarSalario(10.00); //como el parametro es double es monto fijo
        
        //Muestro resultados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        System.out.println("\nActualizacion de salario metodo Porcentaje");
        emp2.actualizarSalario(100); //como el parametro es int: es porcentaje
        emp3.actualizarSalario(30);
        emp4.actualizarSalario(100);
        
        //Muestro resultados
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        
        //muestro total de empleados
        System.out.println("");
        Empleado.mostrarTotalEmpleados();
    }
    
}

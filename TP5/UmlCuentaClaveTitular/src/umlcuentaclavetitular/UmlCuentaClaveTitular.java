/*
 * 
 */
package umlcuentaclavetitular;

/**
 *
 */
public class UmlCuentaClaveTitular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear titulares
        Titular titular1 = new Titular("Ana", "30123456");
        Titular titular2 = new Titular("Carlos", "35876543");
        Titular titular3 = new Titular("Maria", "35222333");
        
        System.out.println("Titulares creados:");
        System.out.println("1. " + titular1);
        System.out.println("2. " + titular2);
        System.out.println("3. " + titular3);
        
               
        // Crear cuentas bancarias con composicion de claves de seguridad
        CuentaBancaria cuenta1 = new CuentaBancaria("001", 50000.0, "1234", "27/6");
        CuentaBancaria cuenta2 = new CuentaBancaria("002", 75000.0, "5678", "20/8");
        CuentaBancaria cuenta3 = new CuentaBancaria("003", 100000.0, "9999", "12/7");
        
        System.out.println("Cuentas creadas (con claves de seguridad por composicion):");
        System.out.println("1. " + cuenta1.obtenerInformacionCompleta());
        System.out.println("2. " + cuenta2.obtenerInformacionCompleta());
        System.out.println("3. " + cuenta3.obtenerInformacionCompleta());
        
                
        // Asignar titulares a cuentas (relación bidireccional)
        titular1.asignarCuenta(cuenta1);
        titular2.asignarCuenta(cuenta2);
        
        System.out.println("Despues de asignar titulares:");
        System.out.println("Titular 1: " + titular1);
        System.out.println("Titular 2: " + titular2);
        System.out.println("Titular 3: " + titular3);
        System.out.println("Cuenta 3: " + cuenta3.obtenerInformacionCompleta());
        
                
        // Demostrar la bidireccionalidad
        System.out.println("Desde cuenta1: " + cuenta1.getTitular().getNombre());
        System.out.println("Desde titular1: " + titular1.getCuentaBancaria().getCbu());
        
                
        // Realizar operaciones bancarias
        System.out.println("Deposito en cuenta1: +$15000");
        cuenta1.depositar(15000.0);
        
        System.out.println("Extraccion de cuenta2 (clave correcta): -$10000");
        boolean extraccionExitosa = cuenta2.extraer(10000.0, "5678");
        System.out.println("Extraccion exitosa: " + extraccionExitosa);
        
        System.out.println("Extraccion de cuenta2 (clave incorrecta): -$5000");
        boolean extraccionFallida = cuenta2.extraer(5000.0, "0000");
        System.out.println("Extraccion exitosa: " + extraccionFallida);
        
        System.out.println("\nEstado actual de cuentas:");
        System.out.println("Cuenta 1 - Saldo: $" + cuenta1.consultarSaldo("1234"));
        System.out.println("Cuenta 2 - Saldo: $" + cuenta2.consultarSaldo("5678"));
        
                
        // Verificar la clave de seguridad
        
        System.out.println("Informacion de clave: " + cuenta1.getClaveSeguridad());
        
                
        // Cerrar una cuenta (demostración de composición)
        cuenta2.cerrarCuenta();
        System.out.println("Cuenta 2 despues de cerrar: " + cuenta2.getTitular());
        System.out.println("Titular 2 despues de cerrar cuenta: " + titular2);
        
        //El titular sigue existiendo independientemente
        System.out.println("Titular2 todavia existe: " + titular2.getNombre());
    }
}
    
    

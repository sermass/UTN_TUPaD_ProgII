/*
 * 
 */
package umlcomputadoraplacapropietario;

/**
 *
 */
public class UmlComputadoraPlacaPropietario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear propietarios
        Propietario propietario1 = new Propietario("Ana", "30123456");
        Propietario propietario2 = new Propietario("Carlos", "35876543");
        
        
        // Crear computadoras con composición (1:1 con placa madre)
        Computadora compu1 = new Computadora("Dell", "DEL123456", "ASUS", "Intel Z");
        Computadora compu2 = new Computadora("HP", "HP789012", "Gigabyte", "AMD");
        Computadora compu3 = new Computadora("Lenovo", "LEN345678", "MSI", "Intel");
        
        System.out.println("Computadoras creadas:");
        System.out.println("1. " + compu1.obtenerInformacionCompleta());
        System.out.println("2. " + compu2.obtenerInformacionCompleta());
        System.out.println("3. " + compu3.obtenerInformacionCompleta());
        
        
        // Asignar computadoras a propietarios (relación 1:1)
        propietario1.setComputadora(compu1);
        propietario2.setComputadora(compu2);
        
       
        System.out.println("");
        System.out.println("Despues de la asignacion:");
        System.out.println(propietario1);
        System.out.println(propietario2);
        System.out.println("Computadora 3: " + compu3.obtenerInformacionCompleta());
        
        
        // Reasignar computadora 2 al propietario 1
        propietario1.setComputadora(compu2);
        
        System.out.println("");
        System.out.println("Despues de reasignar compu2 a propietario1:");
        System.out.println(propietario1 + "posee " + propietario1.getComputadora());
        System.out.println(propietario2 + "posee " + propietario2.getComputadora());
        
                
        // Asignar computadora 3 al propietario 2
        compu3.setPropietario(propietario2);
        System.out.println("");
        System.out.println("Despues de asignar compu3 a propietario2:");
        System.out.println(propietario1);
        System.out.println(propietario2);
        
        System.out.println("Compu2: " + compu2.obtenerInformacionCompleta());
        
        System.out.println("");
        System.out.println("Placa madre de compu1: " + compu1.getPlacamadre());
        
        // Modificar la placa madre de una computadora
        System.out.println("");
        Placamadre nuevaPlaca = new Placamadre("ASRock", "AMD");
        compu1.setPlacamadre(nuevaPlaca);
        System.out.println("Nueva placa madre de compu1: " + compu1.getPlacamadre());
    }
    }
    


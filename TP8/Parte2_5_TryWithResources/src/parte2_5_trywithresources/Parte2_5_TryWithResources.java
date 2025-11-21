/*
 * 
 */
package parte2_5_trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 */
public class Parte2_5_TryWithResources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nombreArchivo = "C:\\Users\\..\\archivo.txt";
        
        // try-with-resources cierra automáticamente los recursos
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            
            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            System.out.println("=".repeat(50));
            
            String linea;
            int numeroLinea = 1;
            
            while ((linea = br.readLine()) != null) {
                System.out.println( numeroLinea + " " + linea);
                numeroLinea++;
            }
            
            System.out.println("=".repeat(50));
            System.out.println("Archivo leido exitosamente. Total lineas: " + (numeroLinea - 1));
            
        } catch (IOException e) {
            System.out.println("Error de E/S al leer el archivo: " + e.getMessage());
            System.out.println(" Verifique que el archivo exista y tenga permisos de lectura.");
        }
    }
    
}

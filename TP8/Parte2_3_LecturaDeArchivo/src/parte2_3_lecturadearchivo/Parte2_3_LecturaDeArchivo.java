/*
 *
 */
package parte2_3_lecturadearchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 */
public class Parte2_3_LecturaDeArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String nombreArchivo = "C:\\Users\\....\\archivo.txt";

        try {
            File archivo = new File(nombreArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            System.out.println("Contenido del archivo '" + nombreArchivo + "':");
            System.out.println("----------------------------------------");

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no existe.");
            System.out.println("Verifique la ruta y nombre del archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

    }
    
}

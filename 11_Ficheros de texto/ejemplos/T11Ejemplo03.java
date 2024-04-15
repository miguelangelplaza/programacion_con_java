import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * T11Ejemplo03  Ejemplo de lectura de un fichero de texto
 */
public class T11Ejemplo03 {

    public static void main(String[] args) {
        try {
            // Abrir el fichero
            BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fruta.txt"));

            // Leer el fichero
            bw.write("Naranja");
            bw.newLine();             // Salto de línea
            bw.write("Mango");
            bw.newLine();
            bw.write("Nispero\n");

            // Cerrar el fichero
            bw.close();

        } catch (IOException ioe) {
            System.out.println("No se ha podidio escribir en el fichero: " +  ioe.getMessage());
        }
    }
}
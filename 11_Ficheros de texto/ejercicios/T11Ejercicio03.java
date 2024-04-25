package ejercicios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa que guarde en un fichero el contenido de otros dos
 * ficheros, de tal forma que en el fichero resultante aparezcan las líneas de los
 * primeros dos ficheros mezcladas, es decir, la primera línea será del primer
 * fichero, la segunda será del segundo fichero, la tercera será la siguiente del
 * primer fichero, etc.
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
 * pasar como argumentos en la línea de comandos.
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas
 * pueden tener tamaños diferentes.
 */

public class T11Ejercicio03 {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Uso del programa: Java T11Ejercicio03 linea1 linea2 mezclalineas");
      System.out.println(0);
    }


    try {
      BufferedReader br1 = new BufferedReader(new FileReader("ficheros/linea1.txt"));
      BufferedReader br2 = new BufferedReader(new FileReader("ficheros/linea2.txt"));
      BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/mezclalineas.txt"));
        
      String linea1 = "";
      String linea2 = "";

      while ((linea1 != null) || (linea2 != null)) {
        linea1 = br1.readLine();
        linea2 = br2.readLine();
        if (linea1 != null) {
          bw.write(linea1 + "\n");
        }
        if (linea2 != null) {
          bw.write(linea2 + "\n");
        }
      }

      br1.close();
      br2.close();
      bw.close();
      
      System.out.println("Archivo mezclalineas.txt creado satisfactoriamente.");

    } catch (IOException ioe) {
      System.out.println("Se ha producido un error de lectura/escritura");
      System.err.println(ioe.getMessage());
    }
  }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * T11Ejercicio01
 * 
 * ///Convertir de un fichero a Arraylist y sacarlo por pantalla 
 * 
 */
public class Ejercicio1examen {
    
public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("REPASO EXAMEN/ficherito/palabras.txt"));
      ArrayList<String> mostrar = new ArrayList<String>();

      String linea = br.readLine();

      while (linea != null) {
        mostrar.add(linea);
        linea = br.readLine();
      }

      for (String string : mostrar) {
        System.out.println(string);
      }

      br.close();
    } catch (IOException ioe) {
      System.out.println("No es posible realizar la escritura de los números");
    }
  }
}

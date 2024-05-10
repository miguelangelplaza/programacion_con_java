
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.io.IOException; 



/**
 * Ejercicio4examen   /// Leer de un fichero de texto (clave-valor) y convertirlo a hashmap, 
 *  modificar Hashmap añadiendo cosas y sobrescribir fichero
 */

public class Ejercicio4examen {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    String line;

    try (BufferedReader br = new BufferedReader(new FileReader("REPASO EXAMEN/ficherito/clave-valor.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("REPASO EXAMEN/ficherito/clave-valor.txt", true))) { // Append mode
      String existingLine;
      boolean lineExists = false;
      while ((existingLine = br.readLine()) != null) {
        for (String key : map.keySet()) {
          if (existingLine.startsWith(key + "=")) {
            lineExists = true;
            break;
          }
        }
        if (!lineExists) {
          bw.write(existingLine + "\n");
        }
        lineExists = false;
      }
      br.close();
      for (String key : map.keySet()) {
        bw.write(key + "=" + map.get(key) + "\n");
      }
      bw.close();
    } catch (IOException ioe) { 
      ioe.printStackTrace();
    }
    map.put("e", "5");
    map.put("f", "6");
    map.put("g", "7");
    map.put("h", "8");
  }
}







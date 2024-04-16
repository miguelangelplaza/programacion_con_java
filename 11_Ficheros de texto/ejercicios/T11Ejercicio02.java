package  ejercicios; 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * T11Ejercicio02
 */
public class T11Ejercicio02 {
  public static void main(String[] args) {
    try {
      File file = new File("ficheros/primos.txt"); 
      Scanner scanner = new Scanner(file); 

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }

      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("El fichero no existe.");
    }
  }
}
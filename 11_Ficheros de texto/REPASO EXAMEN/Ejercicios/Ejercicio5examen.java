import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Ejercicio5examen ///Idem 4 pero pasando el fichero por argumento 
 */
public class Ejercicio5examen {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Please provide the file path as an argument.");
      return;
    }

    String filePath = args[0];
    File file = new File(filePath);

    try {
      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }

      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + filePath);
    }
  }
}
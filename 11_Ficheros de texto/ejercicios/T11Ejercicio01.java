package ejercicios;

import java.io.FileWriter;
import java.io.IOException;

/**
 * T11Ejercicio01
 */
public class T11Ejercicio01 {
  public static void main(String[] args) {
    String fileName = "ficheros/primos.txt";
    try (FileWriter writer = new FileWriter(fileName)) {
      for (int i = 2; i <= 500; i++) {
        if (esPrimo(i)) {
          writer.write(i + "\n");
        }
      }
      System.out.println("Numeros primos se guardan en: " + fileName);
    } catch (IOException e) {
      System.out.println("Ha ocurrido un error mientras se escribia en el archivo.");
      e.printStackTrace();
    }
  }

  public static boolean esPrimo(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}

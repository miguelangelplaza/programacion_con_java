package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Crea un método que reciba un archivo y devuelva la cantidad de palabras
 * que contiene dicho archivo. Consulta la documentación de la clase String para
 * apoyarte en algún método que te permita dividir las palabras que contiene 
 * una línea. Utiliza un buffer para realizar la lectura de forma más eficiente.
 * Prueba la función dentro del método main en el mismo archivo.
 * 
 * @author Miguel Angel Plaza 
 */

public class T11EjercicioLectura {

  public static void contarPalabras(String nombreArchivo) {
    int cantidadPalabras = 0;

    try {
      BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
      String linea = br.readLine();

      while (linea != null) {
        String[] palabras = linea.split("\\s+");    // 1 o mas ocurrencia de la expresion regular\s, que representa el espacio
        cantidadPalabras += palabras.length;
        linea = br.readLine();
      }

      System.out.println("El archivo " + nombreArchivo + " contiene " + cantidadPalabras + " palabras.");
      br.close();

    } catch (Exception e) {
      System.out.println("No es posible contar las palabras");
    }
  }

  public static void main(String[] args) {
    System.out.println("Introduzca el nombre del archivo que desea contar sus palabras: ");
    String nombreArchivo = System.console().readLine();

    contarPalabras(nombreArchivo);
  }

}
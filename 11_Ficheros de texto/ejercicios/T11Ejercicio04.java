package ejercicios;

import java.io.File;

/**
 * T11Ejercicio04 
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea
 */
public class T11Ejercicio04 {
public static void main(String[] args) {
    if (args.length != 1) {
        System.out.println("Uso del programa: T11Ejercicio04 palabras.txt");
        System.exit(-1);
    }
    String nombreFichero = args[0];
    String nombreFicheroOrdenado = nombreFichero.replace("palabras.txt", "palabras_sort.txt");
    try {
        java.io.File fichero = new java.io.File(nombreFichero);
        java.io.File ficheroOrdenado = new java.io.File(nombreFicheroOrdenado);
        java.util.ArrayList<String> palabras = new java.util.ArrayList<>();
        try (java.util.Scanner sc = new java.util.Scanner(fichero)) {
            while (sc.hasNextLine()) {
                palabras.add(sc.nextLine());
            }
        }
        palabras.sort(null);
        try (java.io.PrintWriter pw = new java.io.PrintWriter(ficheroOrdenado)) {
            for (String palabra : palabras) {
                pw.println(palabra);
            }
        }
        System.out.println("Palabras ordenadas alfabéticamente en: " + nombreFicheroOrdenado);
    } catch (java.io.FileNotFoundException ioe) {
        System.out.println("No se ha encontrado el fichero " + nombreFichero);
    } catch (java.io.IOException ioe) {
      System.out.println("Error de lectura/escritura");
    }
}
    
}
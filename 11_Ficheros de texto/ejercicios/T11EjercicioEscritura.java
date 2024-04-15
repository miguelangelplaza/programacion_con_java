package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * T11EjercicioEscritura  
 * 
 * Crea un metodo que reciba el nombre de un archivo y un entero. 
 * El metodo debera crear el archivo y escribir tantas lineas como indique el entero pasado por parametro. 
 * Cada linea debera tener escrito "Esta es la linea numero n" , sustituyendo n por el numero de la linea, empezando por 1. 
 * Utiliza un buffer para realizar la escritura de forma mas eficiente. 
 * Prueba la funcion dentro del metodo main del mismo archivo
 * 
 * @author  Miguel Angel Plaza Rueda 
 */


public class T11EjercicioEscritura {

    public static void crearLineas(String nombreArchivo, int n) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int i = 1; i <= n; i++) {
                bw.write("Esta es la linea numero " + i);
                bw.newLine();
            }

            bw.close();

        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero: " + ioe.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Introduzca el nombre del archivo: ");
        String nombreArchivo = System.console().readLine();
        System.out.println("Introduzca el numero de lineas: ");
        int n = Integer.parseInt(System.console().readLine());
        crearLineas(nombreArchivo, n);
        
    }
}

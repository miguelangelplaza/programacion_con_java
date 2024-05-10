import java.util.Scanner;
import modules.Diccionario;

/**
 * @author Sergio Sánchez Martín
 */

public class Examen {
  public static void main(String[] args) {
    // Diccionario 
    // diccionario = new Diccionario();
    // String nombreArchivo = "ingles.txt";

    
    // String nombreArchivo = ingles.txt;
    // Diccionario diccionario = new Diccionario(cargar(nombreArchivo));
    // String nombreArchivo = args[0];
    // if (args.length != 1) {
    //   System.out.println("Uso del programa: java Examen <Examen>");
    //   System.exit(-1);
    // }
    
    


    // if (args.length != 1) {
    //   System.out.println("Uso del programa: java Examen <Examen>");
    //   System.exit(-1);
    // }

    // String nombreArchivo = args[0];
    // Diccionario diccionario = new Diccionario();

    // diccionario.cargar(nombreArchivo);


    if (args.length !=-1) {
      System.out.println("Uso del programa: java Examen <nombre_archivo>");
      System.exit(-1);
    }
    String nombreArchivo = args[0];
    Diccionario diccionario = new Diccionario();
    ///cargamos el diccionario con el fichero de entrada por parametros
    diccionario.cargar(nombreArchivo);


    Scanner scanner = new Scanner(System.in);
    int opcion;
    do {
      System.out.println("\nMenú:");
      System.out.println("0) Salir");
      System.out.println("1) Listar todas las palabras del diccionario");
      System.out.println("2) Añadir palabra al diccionario");
      System.out.println("3) Borrar palabra del diccionario");
      System.out.println("4) Editar significado de una palabra");
      System.out.println("5) Mostrar significado de una palabra");
      System.out.println("6) Guardar diccionario");
      System.out.println("7) Ordenar palabras alfabéticamente");

      System.out.print("Elige una opción: ");
      opcion = scanner.nextInt();
      scanner.nextLine(); // Limpiar el buffer de entrada

      switch (opcion) {
        case 0:
          System.out.println("Saliendo...");
          break;
          
        case 1:
          diccionario.listar();
          break;

        case 2:
          System.out.print("Introduce la palabra a añadir: ");
          String nuevaPalabra = scanner.nextLine();
          if (!diccionario.buscar(nuevaPalabra)) {
              System.out.print("Introduce el significado de la palabra: ");
              String nuevoSignificado = scanner.nextLine();
              diccionario.anadir(nuevaPalabra, nuevoSignificado);
          } else {
              System.out.println("La palabra ya existe en el diccionario.");
          }
          break;

        case 3:
          System.out.print("Introduce la palabra a borrar: ");
          String palabraBorrar = scanner.nextLine();
          if (diccionario.buscar(palabraBorrar)) {
              diccionario.borrar(palabraBorrar);
          } else {
              System.out.println("La palabra no existe en el diccionario.");
          }
          break;

        case 4:
          System.out.print("Introduce la palabra a editar: ");
          String palabraEditar = scanner.nextLine();
          if (diccionario.buscar(palabraEditar)) {
              System.out.print("Introduce el nuevo significado: ");
              String nuevoSignificadoEditar = scanner.nextLine();
              diccionario.editar(palabraEditar, nuevoSignificadoEditar);
          } else {
              System.out.println("La palabra no existe en el diccionario.");
          }
          break;
          
        case 5:
          System.out.print("Introduce la palabra para ver su significado: ");
          String palabraConsultar = scanner.nextLine();
          if (diccionario.buscar(palabraConsultar)) {
              System.out.println(diccionario.significado(palabraConsultar));
          } else {
              System.out.println("La palabra no existe en el diccionario.");
          }
          break;

        case 6:
          diccionario.guardar(nombreArchivo);
          break;

        case 7:
          diccionario.ordenarAlfabeticamente();
          break;

        default:
          System.out.println("Opción no válida.");
      }

    } while (opcion != 0);
    scanner.close();
  }
}
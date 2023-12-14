package examen;

/**
 * Ejercicio01
 */

 import java.util.Scanner; 

public class Ejercicio01 {
  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Apellido 1: ");
    String apellido1 = scanner.nextLine();
    System.out.print("Appelido 2: ");
    String apellido2 = scanner.nextLine();
    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();
    
    
    System.out.print("Introduce las notas del primer trimestre: ");
    int nota1 = scanner.nextInt();
    

    System.out.print("Introduce las notas del segundo trimestre: ");
    int nota2 = scanner.nextInt();

    System.out.print("Introduce las notas del tercer trimestre: ");
    int nota3 = scanner.nextInt();
    
    if (nota1 < 0)  {
      System.out.println("El numero introducido no es valido. Debe ser un numero entero positivo.");
    } else {

                             


     scanner.close();
  }
  
}
}

package ejercicios;

/**
 * T04Ejercicio14 
 * 
 * @author Miguel Angel Plaza Rueda 
 */
public class T04Ejercicio14 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());

    if ((n % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((n % 5) == 0) {
      System.out.println(" y es divisible por 5");
    } else {
      System.out.println(" y no es divisible por 5");
    }

  }
}
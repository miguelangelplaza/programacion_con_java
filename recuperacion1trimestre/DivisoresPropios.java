/**
 * DivisoresPropios
 */
import java.util.Scanner; 

public class DivisoresPropios {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Por favor, introduce un numero entero: ");
    int numero = scanner.nextInt();
      
    if (numero <= 0) {
      System.out.println("Por favor, introduce un número entero positivo ");
    } else {       
      int sumaDivisores = 0;

      System.out.print("Divisores propios de " + numero + ": ");

      for (int i = 1; i <= numero / 2; i++) {
        if (numero % i == 0) {
          System.out.print(i + " ");
          sumaDivisores += i;
        }
      }
        
      System.out.println("\nLa suma de los divisores propios es: " + sumaDivisores);
    }
  
  scanner.close();
  }
}
  
  

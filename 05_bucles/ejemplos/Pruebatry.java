package ejemplos;

/**
 * Pruebatry
 */
import java.util.Scanner;
public class Pruebatry {

  public static void main(String[] args) {
    double numero1;
    double numero2;

    Scanner sc = new Scanner (System.in); 

    try {
      System.out.print("introduzca el primer numero: ");
      numero1 = Double.parseDouble(sc.nextLine());
      System.out.print("introduzca el segundo numero: ");
      numero2 = Double.parseDouble(sc.nextLine());
      System.out.print("la media es " + (numero1 + numero2) /2);
    } catch (Exception e) {
      System.out.println("no se puede calcular la media");
      System.out.println("los datos introducidos no son corecctos");
    } finally {
      System.out.println(" gracias por utilizar este programa");
    }
  }
}


/**
 * ConversorPesetasEuros
 */
import java.util.Scanner;
public class ConversorPesetasEuros {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    
    System.out.print("Introduce la cantidad en pesetas: ");
    int pesetas = scanner.nextInt();
    

    
    double factorConversion = 166.386;
    
      // 166.386 = 1 
      // x = 

    double euros = (double) (pesetas / factorConversion);

    System.out.printf("%d pesetas son %.2f euros%n", pesetas, euros);

    scanner.close();
}
}

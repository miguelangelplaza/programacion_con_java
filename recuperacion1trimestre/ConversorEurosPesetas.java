/**
 * ConversorEurosPesetas
 */
import java.util.Scanner;

public class ConversorEurosPesetas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce la cantidad en euros: ");
        double euros = scanner.nextDouble();

        
        double factorConversion = 166.386;
        int pesetas = (int) (euros * factorConversion);
        System.out.printf("%.2f euros son %d pesetas%n", euros, pesetas);

        scanner.close();
    }
}

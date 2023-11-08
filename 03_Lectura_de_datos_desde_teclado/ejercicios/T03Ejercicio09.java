import java.util.Scanner;

/**
 * T03Ejercicio09 // Escribe un programa que calcule el volumen de un cono según la fórmula V =
1
3
πr2h
 *
 * @author Miguel Angel Plaza Rueda
 */
import java.util.Scanner;
public class T03Ejercicio09 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del cono (en metros): ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cono (en metros): ");
        double altura = scanner.nextDouble();

        // Calcular el volumen del cono
        double volumen = (1.0/3.0) * Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volumen del cono es: " + volumen + " metros cúbicos");

        // Cerrar el scanner
        scanner.close();
    }
}
  

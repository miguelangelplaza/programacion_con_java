/**
 * Ejercicio02
 * 
 * 
 * @author Miguel Angel Plaza Rueda 
 */
import java.util.Scanner;

public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce el primer operando :");
    double numero1 = scanner.nextDouble();

    System.out.println("Introduce el codigo de la operación (+, -, *, /, ^, %):");
    char operador = scanner.next().charAt(0);

    System.out.println("Introduce el segundo operando :");
    double numero2 = scanner.nextDouble();


    double resultado = 0.0;


    switch (operador) {
      case '+':  //Sumo los dos operandos 
        resultado = numero1 + numero2;
        System.out.printf("El resultado es: %.2f\n", resultado);
        break;
      case '-':  //Resto los dos operandos 
        resultado = numero1 - numero2;
        System.out.printf("El resultado es: %.2f\n", resultado);
        break;
      case '*':  //Se multiplican los dos operandos 
        resultado = numero1 * numero2;
        System.out.printf("El resultado es: %.2f\n", resultado);
        break;
      case '/':  // Divide los dos operanods 
        resultado = numero1 / numero2;
        System.out.printf("El resultado es: %.2f\n", resultado);
        break;
      case '^':  //Primer numero hace de base y segundo de exponente
        resultado = Math.pow(numero1, numero2);
        System.out.printf("El resultado es: %.2f\n", resultado);
        break;
      case '%':  //resto de la divicion entre el primer y el segundo numero 
        resultado = numero1 % numero2;
        System.out.printf("El resultado es: %.2f\n", resultado);
        break;
      
      }

  scanner.close();
  }
}

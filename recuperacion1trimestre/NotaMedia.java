/**
 * NotaMedia
 */
import java.util.Scanner;

public class NotaMedia {

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          ////Pido por teclado las notas (con double por si son decimales)
          System.out.print("Introduce la primera nota: ");
          double nota1 = scanner.nextDouble();
          System.out.print("Introduce la segunda nota: ");
          double nota2 = scanner.nextDouble();
          System.out.print("Introduce la tercera nota: ");
          double nota3 = scanner.nextDouble();


          ///////Calculo la media de las notas 
          double media = (nota1 + nota2 + nota3) / 3;
          ////Si la nota media es mayor o igual a 5 sale verde (aprobado), en cambio si la media sale roja sera menor que 5 (suspenso)
          if (media >= 5.0) {
              System.out.println("\033[0;32m ¡Enhorabuena! Has aprobado con una nota media de " + media + "\033[0m");
          } else {
              System.out.println("\033[0;31m Lo siento, has suspendido con una nota media de " + media + "\033[0m");
          }

          scanner.close();
      }
}

/**
 * Ejemplo03
 */
import java.util.Scanner;


public class Ejemplo03 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int dia;

  System.out.println("introduce un dia de la semana");
  dia = sc.nextInt();

  if ((dia >=1) && (dia <=5)){

    System.out.println("Es un dia entre semana");
  } else {
    System.out.println("Es fin de semana");
  }
}
  
}
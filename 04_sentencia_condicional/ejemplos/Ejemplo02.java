/**
 * Ejemplo02
 */
import java.util.Scanner;

public class Ejemplo02 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int numero;

  System.out.println("introduce un valor entre 1 y 100");
  numero = sc.nextInt();

  if ((numero >=1)&& (numero <=100)){
    System.out.println("enhorabuena");
  } else {
    System.out.println("el numero introducido no esta en el rango entre 1 y 100");
  }
}
  
}

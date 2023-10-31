/**
 * Ejemplo01
 * 
 * @author Miguel Angel
 * 
 */


import java.util.Scanner;

public class Ejemplo01 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int nota; 
  

  System.out.println("Que nota has sacado en el ultimo examen?");
  nota = sc.nextInt();

  if (nota >= 5) {
    System.out.println("¡Enhorabuena!, ¡has aprobado!");
  } else {
    System.out.println("Lo siento, has suspendido.");
 } 
}
}

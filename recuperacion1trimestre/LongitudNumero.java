/**
 * LongitudNumero
 */
import java.util.Scanner;

public class LongitudNumero {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce un numero entero por pantalla: \n");
    int numEnt = scanner.nextInt();



    if (numEnt> 0 && numEnt<= 99) {
      System.out.println(numEnt + " = " + "Lo componen 2 digitos. ");

      
    }
    if (numEnt >=100 && numEnt<=999) {
      System.out.println(numEnt + " = " + "Lo componen 3 digitos. ");
    }


    if (numEnt >=1000 && numEnt<=9999) {
      System.out.println(numEnt + " = " + "Lo componen 4 digitos. ");
    }


    if (numEnt >=10000 && numEnt<=99999) {
      System.out.println(numEnt + " = " + "Lo componen 5 digitos. ");
    }

    if (numEnt >=100000 && numEnt<=999999) {
      System.out.println(numEnt + " = " + "Lo componen 6 digitos. ");
    }


    scanner.close();
    
      
    }

    
  }

  

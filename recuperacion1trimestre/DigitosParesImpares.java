/**
 * DigitosParesImpares
 */

import java.util.Scanner;

public class DigitosParesImpares {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Por favor, introduce un número entero positivo: ");
    long numero = scanner.nextLong();
  
        
    if (numero < 0) {
    System.out.println("Por favor, introduce un número entero positivo ");
    } else {
              
    int pares = 0;
    int impares = 0;
  
            
    while (numero > 0) {
    long digito = numero % 10;
  
    if (digito != 0) { 
      if (digito % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }
  
      numero /= 10;
  }
  
             
  System.out.printf("El numero contiene %d dígitos pares y %d dígitos impares.%n", pares, impares);
  }
  
  scanner.close();
  }
}
  


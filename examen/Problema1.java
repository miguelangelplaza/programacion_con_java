/**
 * Problema1// Escribe un programa que convierta una cantidad de días a su equivalente en años, meses y días.
 * 
 * 
 * @author Miguel Angel Plaza Rueda 
 */
import java.util.Scanner;

public class Problema1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("\033[1;30mCALCULADORA DE TIEMPO");
    System.out.println("=====================\033[0m");
    System.out.println("\033[0mIntroduce una cantidad de dias: ");
    int dias = sc.nextInt();
    int meses =( dias / 30 );
    int anos = (dias / 365 );
    int diass = (dias / 365);
    
    
    //System.out.println(anos);
    //System.out.println(meses);
    System.out.println(dias + " dias son \033[48;5;88m" + anos + " años, \033[48;5;178m" + meses + " meses"+" y \033[48;5;64m" + diass + " dias.");
      
    sc.close();
  }
  
}
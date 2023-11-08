package ejercicios;

/**
 * T03Ejercicios05
 * 
 * @author Miguel Angel Plaza Rueda
 */
public class T02Ejercicio05 {
  public static void main(String[] args) {
    int pesetasAConvertir = 1000;
    double euros = pesetasAConvertir / 166.386;   

    System.out.println(pesetasAConvertir + " pta --> " + euros + " €");
    System.out.printf("%d pta --> %.2f €", pesetasAConvertir, euros);   
  }
}
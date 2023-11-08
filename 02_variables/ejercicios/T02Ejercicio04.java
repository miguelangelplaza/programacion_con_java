package ejercicios;

/**
 * T03Ejercicio04
 * 
 * 
 * @author Miguel Angel Plaza Rueda 
 */
public class T02Ejercicio04 {
  public static void main(String[] args) {
    double eurosAConvertir = 6.00;
    int pesetas = (int) (eurosAConvertir * 166.386);     

    System.out.println(eurosAConvertir + " € --> " + pesetas + " pta");
    System.out.printf("%.2f € --> %d pta", eurosAConvertir, pesetas);  
  }
}
  

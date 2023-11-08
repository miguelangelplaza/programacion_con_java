import java.util.Scanner;

/**
 * Problema4
 * 
 * @author Miguel Angel Plaza Rueda 
 * 
 */
public class Problema4 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("VOLUMEN DE UN TRONCO DE CONO");
        System.out.println("=============================");

        System.out.print("Introduce la base mayor (en cm) ");
        double Radio = sc.nextDouble();

        System.out.println("Introduce la base menor (en cm)");
        double radioo = sc.nextDouble();

        System.out.print("Ingrese la altura h del cono (en cm): ");
        double altura = sc.nextDouble();

        
        double volumen = (1.0/3.0) * Math.PI * altura * (Math.pow(Radio, 2) + Math.pow(radioo, 2) + (radioo + Radio));

        System.out.printf("El volumen del teroide es de: \033[0;31m" + volumen + " cm\u00B3");

        
        sc.close();
    }
}
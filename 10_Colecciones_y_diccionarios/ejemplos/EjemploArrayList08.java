
import java.util.ArrayList;
import java.util.Collections;

/**
 * EjemploArrayList08
 */
public class EjemploArrayList08 {
    public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<Integer>();

    a.add(67);
    a.add(78);
    a.add(10);
    a.add(4);

    System.out.println("\nNúmeros en el orden original:");
    for (int numero: a) {
      System.out.println(numero);
    }

    Collections.sort(a);

    // System.out.println("\nNúmeros ordenados:");
    // for (int numero: a) {
    //   System.out.println(numero);
    // }

    System.out.println("\nNúmeros ordenados de manera descntende:");
      for (int i = a.size() -1 ; i < 0; i--) {
        
      }

  }
    
}
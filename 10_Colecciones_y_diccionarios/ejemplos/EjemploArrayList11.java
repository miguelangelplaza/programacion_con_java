package ejemplos;
import java.util.ArrayList;

/**
 * EjemploArrayList11
 */
public class EjemploArrayList11 {
    public static void main(String[] args) {
  
      ArrayList<Integer> a = new ArrayList<Integer>();    //No se usa int sino su wrapper: Integer 
  
      a.add(18);
      a.add(22);
      a.add(-30);
  
      System.out.println("Nº de elementos: " + a.size());        
  
      System.out.println("El elemento que hay en la posición 1 es " + a.get(1));
    }
  }


  // ArrayList<String> opciones = new ArrayList<>(respuestasIncorrectas.subList(0, 2));

import java.util.ArrayList;

/**
 * EjemploArrayList07
 */
public class EjemploArrayList07 {
  public static void main(String[] args) {

    ArrayList<Gato> g = new ArrayList<Gato>();

    g.add(new Gato("Garfield", "naranja", "mestizo"));
    g.add(new Gato("Pepe", "gris", "angora"));
    g.add(new Gato("Mauri", "blanco", "manx"));
    g.add(new Gato("Ulises", "marrón", "persa"));

    System.out.println("Datos de los gatos:");

    for (Gato gatoAux: g) {
      System.out.println(gatoAux);
    }
  }
    
}
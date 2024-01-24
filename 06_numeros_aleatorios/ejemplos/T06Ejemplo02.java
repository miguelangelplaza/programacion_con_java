package ejemplos;

/**
 * Explicación de generación de palabras aleatorias
 * 
 * @author Miguel Angel Plaza Rueda 
 * 
 * T06Ejemplo02
 */
public class T06Ejemplo02 {
  public static void main(String[] args) {
    System.out.println("Genera al azar piedra, papel o tijera: ");

    int mano = (int)(Math.random()*3); // Genera un número aleatorio entre el 0 y el 2, ambos incluidos

    // Una vez se tiene ese número, se consulta cual ha salido y se actúa sobre ello, con palabras asignadas a cada uno de los casos posibles
    
    switch (mano) {
      case 0:
        System.out.println("Piedra");
        break;
      case 1:
        System.out.println("Papel");
        break;
      case 2:
        System.out.println("Tijera");
        break;
    }
  }
}
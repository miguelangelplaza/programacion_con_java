package ejemplos;

/**
 * Explicación de números aleatorios
 * 
 * @author Miguel angel plaza rueda
 */
/**
 * T06Ejemplo01
 */
public class T06Ejemplo01 {
  public static void main(String[] args) {
    System.out.println("Diez números aleatorios: ");

    for (int i = 1; i < 11; i++) {
      System.out.println((int)(Math.random()*10 + 7));

      // Math.random() genera números reales aleatorios entre el 0 y el 1, este no incluido
      // Para conseguir números aleatorios desde el 0 al 10, se multiplicara la función por 10, y se parseará a un int
      // En caso de querer obtener números desde un número determinado hasta 10 más, al paso anterior se le sumará ese número de inicio

      System.out.println((int)(Math.random()*23 + 4));

      // En este caso, los números empiezan en el número 4 y acaban en el 27 (no incluido)
    }
  }
}
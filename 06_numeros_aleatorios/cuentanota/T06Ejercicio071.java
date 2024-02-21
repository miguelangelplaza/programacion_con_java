package cuentanota;
/**
 * T06Ejercicio071
 */
public class T06Ejercicio071 {
  public static void main(String[] args) {
    
    int partidoResultado; 
    int aciertos = 0; // Variable para contar el número de aciertos

    for (int fila = 1; fila <= 15; fila++) {

      System.out.printf("%4d. |", fila);

      int columnas = (fila == 15) ? 4 : 3; // 3 columnas para los primeros 14 partidos, 4 columnas para el Pleno al 15

      for (int apuesta = 1; apuesta <= columnas; apuesta++) {

        if (fila == 15 && apuesta == 4) { // Pleno al 15, mostrará 0, 1, 2 o M (más de 2 goles)
          int goles = (int)(Math.random() * 4); // 0, 1, 2 o 3
          if (goles == 3) {
            System.out.print(" M |");
          } else {
            System.out.print(" " + goles + " |");
          }
        } else { // 1X2 para los primeros 14 partidos
          partidoResultado = (int)(Math.random() * 3) + 1;

          switch (partidoResultado) {
            case 1:
              System.out.print(" 1 |");
              break; 

            case 2:
              System.out.print(" 2 |");
              break;

            case 3:
              System.out.print(" X |");
              break;
          
            default:
              // ¿Hay algo específico que debería suceder aquí?
              break;
          }
        }
      }

      // Verificar aciertos para cada fila (partido)
      if (fila != 15) {
        int resultadoAciertos = (int)(Math.random() * (columnas + 1));
        aciertos += resultadoAciertos;
        System.out.print(" Aciertos: " + resultadoAciertos);
      }

      System.out.println();
    }

    System.out.println("------------------");

    // Mostrar el número total de aciertos
    System.out.println("Número total de aciertos: " + aciertos);

    // Verificar si el usuario ha sido premiado (más de 10 aciertos)
    if (aciertos >= 10) {
      System.out.println("¡Enhorabuena! Has sido premiado.");
    }
  }
}

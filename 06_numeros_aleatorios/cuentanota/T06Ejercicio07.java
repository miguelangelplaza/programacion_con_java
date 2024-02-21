package cuentanota;
// /**
//  *T06Ejercicio07  //Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
// para los 14 partidos y el pleno al quince (15 filas).
//  * 
//  * 
//  * 
//  * @author Miguel Angel Plaza Rueda
//  * 
//  */
public class T06Ejercicio07 {
  public static void main(String[] args) {

    int partidoResultado;

    for (int fila = 1; fila <= 15; fila++) {

        // System.out.printf("%4d. |", fila);

        if (fila == 15) {

          int golesEquipoLocal = (int) (Math.random() * 3);
          int golesEquipoVisitante = (int) (Math.random() * 3);

          System.out.println("  -----------------");
          System.out.printf("  15. | Local %d Visitante %d ", golesEquipoLocal, golesEquipoVisitante);

        } else {

          System.out.printf("%4d. |", fila);
          
          for (int apuesta = 1; apuesta <= 3; apuesta++) {

              partidoResultado = (int) (Math.random() * 3) + 1;

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


                  }
              }
          }

          System.out.println();
          
      }


  }
}

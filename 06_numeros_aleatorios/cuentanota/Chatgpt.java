package cuentanota;

public class Chatgpt {

    public static void main(String[] args) {
      int partidoResultado;
      for (int fila = 1; fila <= 15; fila++) {
          System.out.printf("%4d. |", fila);
          if (fila == 15) {
               int golesEquipoLocal = (int) (Math.random() * 4);
               int golesEquipoVisitante = (int) (Math.random() * 4);
               System.out.printf(" %d - %d |", golesEquipoLocal, golesEquipoVisitante);
          } else {
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

        System.out.println("------------------");
    }
}


/**
 * Tema 5 - Bucles
 * 
 * Escribe un programa que lea un número por pantalla e imprima un gráfico de barras horizontal (el número tiene que ser mayor que 0)
 * Este gráfico podrá imprimirse de forma simple o en color.
 * 
 * @author Sergio Sánchez
 */
public class T05Histograma {
  public static void main(String[] args) {
    int cifraIntroducida = 0;
    long numeroCompleto = 0;
    long numeroVolteado = 0;
    int digito = 0;
    int numeroDigitos = 0;
    int digitoMayor = 0;
  
    System.out.println("Introduzca números entre 0 y 9 y pulsa INTRO. Introduce un número negativo si desea parar.");
    do {
      cifraIntroducida = Integer.parseInt(System.console().readLine());
      if (cifraIntroducida >= 0 && cifraIntroducida <= 9) {
        numeroCompleto = (numeroCompleto * 10) + cifraIntroducida; 
      }
    } while (cifraIntroducida >= 0);
    
    //Le damos la vuelta al número y además actualizamos cuál es el dígito mayor
    while (numeroCompleto > 0) {
      digito = (int) (numeroCompleto % 10);
      if (digito > digitoMayor) {
        digitoMayor = digito;
      }
      numeroVolteado = digito + (numeroVolteado * 10);
      numeroCompleto /= 10;
      numeroDigitos++;
    }

    //Empezamos a mostrarlo en forma de tabla, teniendo en cuenta que hay que pintar digitoMayor + 1 columnas
    int numeroColumnas = digitoMayor + 1;
    int numeroFilas = numeroDigitos;
    
    //Pintamos numeroColumnas columnas
    for (int j = 1; j <= numeroColumnas; j++) {
        System.out.print(" ---");
    }

    for (int i = 1; i <= numeroFilas; i++) {
      System.out.println();
      digito = (int) (numeroVolteado % 10);
      numeroVolteado /= 10;
      System.out.print("| " + digito + " |");     //Pintamos 1ª columna
      
      //Pintamos tantas columnas como indique el digito
      for (int j = 1; j <= digito; j++) {
        System.out.print(" * |");                 
      }
      //Del total de columnas, ya se han pintado digito + 1 columnas con asterisco
      //Por tanto, quedan por pintar en blanco numeroColumnas - digito - 1 columnas
      for (int j = 1; j <= numeroColumnas - digito - 1; j++) {
        System.out.print("   |");
      }
      System.out.println("");       //Salto de línea -> Fila siguiente
      
      //Volvemos a pintar numeroColumnas + 1 columnas
      for (int j = 1; j <= numeroColumnas; j++) {
        System.out.print(" ---");      //Para cerrar la fila
      }
    }
  }
}
/**
 * T05Histograma2
 */
public class T05Histograma2 {

  public static void main(String[] args) {
    int cifraIntroducida = 0 ;
    long numeroCompleto = 0 ;
    long numeroVolteado = 0 ;
    int digitoMayor = 0; 
    int digito = 0; 
    int numeroDigitos = 0; 

    System.out.println("Introduca numero entre el 0 y el 9 y pulsa intro. Introduce un numero negativ osi desa parar");
    do {
      cifraIntroducida = Integer.parseInt(System.console().readLine());
      if (cifraIntroducida >= 0 && cifraIntroducida <=9 ) {
        numeroCompleto = (numeroCompleto * 10) + cifraIntroducida;
        
      }

    } while ( cifraIntroducida >=0 );
    //le damos la vuelta al numero y ademas vamos a ver cual es el digito mayor 
    while (numeroCompleto > 0 ) {
      digito = (int) (numeroCompleto % 10); 
      if (digito > digitoMayor) {
        digitoMayor = digito; 
      }
      numeroVolteado = (numeroVolteado * 10) + digito; 
      numeroCompleto /= 10; 
      numeroDigitos++;

    }
    //empezamos a mostrarlo en forma de tabla, teniendo en cuenta que hay que pinta digitomayor +1 columnas y numerodigitos flas 
    int numeroColumnas = digitoMayor +1 ; 
    int numeroFilas = numeroDigitos ; 

    //pintamos primera hilera de guiones 
    for (int i = 1; i <= numeroColumnas; i++); {
      System.out.print(" ---");
    }
    
    //empezamos a pintar las filas 
    for (int i=1; i< numeroFilas; i++){
      System.err.println();
      digito = (int) (numeroVolteado % 10);
      numeroVolteado/=10;
      System.out.print("| " + digito + " |");    //pintamos la 1º columna, la de los digitos introducidos
      

      for (int j = 1; j <= numeroColumnas; j++) {
        System.out.print("   |");

      }
      System.out.println();

      for (int j = 1; j<= numeroColumnas; j++){
      System.out.print(" ---");
      }
      
    }

    
}
}
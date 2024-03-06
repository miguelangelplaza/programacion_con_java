
import clases.*;
/**
 * Juego Siete y Media
 * 
 * @author Francisco Javier Cabello Rueda & Miguel Ángel Plaza
 */
 public class SieteYMedia {

  public static void main(String[] args) {

    boolean jugar = true;
    boolean correcto = true;
    boolean seguirJugando = true;
    String repuestaJugar;
    Carta cartaJugador;
    Carta cartaBanca;  
    String respuestaSeguirJugando;
    boolean turnoBanca = true;
    
    Jugador jugador = new Jugador();        //Crear Nuevo Jugador

    System.out.println(" ------------------------------ ");
    System.out.println("|        SIETE y  MEDIA        |");
    System.out.println(" ------------------------------ ");
    System.out.println("");


    Baraja baraja = new Baraja();
    Mano manoJugador= new Mano();         //Crear Baraja, Mano del Jugador y Mano de la Banca
    Mano manoBanca= new Mano();
  
    do {

      baraja.barajar();                  //Barajar
      System.out.println("En tu monedero tienes " + jugador.getSaldo() + " euros.");
      System.out.println("");

      if (jugador.getSaldo() > 0) {        //En caso de que el saldo sea mayor a 0

        do {
          correcto = true;

          System.out.print("¿Cuánto dinero quieres apostar?: ");
          jugador.setApuesta(Integer.parseInt(System.console().readLine()));  //Introducir apuesta
    
          if (jugador.getApuesta() > jugador.getSaldo()) {            //Repetir en caso de introducir un número incorrecto
            System.out.println("");
            System.out.println("ERROR, no puedes apostar mas dinero de lo que tienes");
            System.out.println("");
            correcto = false;
          } else if (jugador.getApuesta() == 0){
            System.out.println("");
            System.out.println("ERROR, apuesta vacía");
            System.out.println("");
            correcto = false;
          } else if (jugador.getApuesta() < 0) {
            System.out.println("");
            System.out.println("ERROR, apuesta introducida en negativo");
            System.out.println("");
            correcto = false;
          } 
        } while (correcto == false);
       
        System.out.println("");
        System.out.println(" ----------------- ");
        System.out.println("|   ES TU TURNO   |");
        System.out.println(" ----------------- ");
        manoJugador.setPuntosAcumulados(0);
        manoBanca.setPuntosAcumulados(0);

        do {
          seguirJugando = true;
    
          cartaJugador = baraja.repartir();   //Repartir una carta
    
          System.out.println("");
          System.out.print("Ha sacado el ");
          baraja.verCarta(cartaJugador);     //Visualizar la carta repartida
    
          manoJugador.acumula(cartaJugador);  //Se acumulan los puntos de la carta
    
          System.out.println("");
          System.out.println("Total de puntos acumulados en esta ronda: " + manoJugador.getPuntosAcumulados());  //Ver puntos acumulados
          System.out.println("");
      
          if (manoJugador.getPuntosAcumulados() < 7.5) {    //Si los puntos son menores a 7.5 preguntar si desea seguir o dar turno a la banca
    
            System.out.print("¿Desea continuar? (Y/N): ");
            respuestaSeguirJugando = System.console().readLine();
            
            if (respuestaSeguirJugando.equals("Y") || respuestaSeguirJugando.equals("y")) {
              seguirJugando = true;
            } else {
              System.out.println("");
              System.out.println(" --------------------- ");
              System.out.println("|  TURNO DE LA BANCA  |");      //Mismo proceso que el jugador pero aleatorio
              System.out.println(" --------------------- ");

              baraja.barajar();

              do {
                cartaBanca = baraja.repartir();

                System.out.println("");
                System.out.print("La Banca ha sacado el ");
                baraja.verCarta(cartaBanca);
                manoBanca.acumula(cartaBanca);
      
                System.out.println("");
                System.out.println("Total de puntos acumulados en esta ronda: " + manoBanca.getPuntosAcumulados());
                System.out.println("");

                if (manoBanca.getPuntosAcumulados() < 7.5) {
                  int aleatorio = (int)(Math.random()*4);
                  if (aleatorio != 0) {
                    turnoBanca = true;
                  } else {

                    turnoBanca = false;

                    if (manoBanca.getPuntosAcumulados() > manoJugador.getPuntosAcumulados()) {
                      System.out.println(" ---------------------------------------- ");
                      System.out.println("|  HAS PERDIDO, LA BANCA TE HA SUPERADO  |");
                      System.out.println("|     PIERDES TODO EL DINERO APOSTADO    |");
                      System.out.println(" ---------------------------------------- ");
                      System.out.println("");
                      jugador.setSaldo(jugador.getSaldo() - jugador.getApuesta());
                    } else {
                      System.out.println(" ------------------------------------ ");
                      System.out.println("|    HAS GANADO!! BANCA SUPERADA!!   |");
                      System.out.println("|     DUPLICAS EL DINERO APOSTADO    |");
                      System.out.println(" ------------------------------------ ");
                      System.out.println("");
                      jugador.setSaldo(jugador.getSaldo() + jugador.getApuesta());
                    }
                  }
                } else if (manoBanca.getPuntosAcumulados() == 7.5){
                  turnoBanca = false;
                  System.out.println(" ---------------------------------------- ");
                  System.out.println("|      HAS PERDIDO, 7,5 DE LA BANCA      |");
                  System.out.println("|     PIERDES TODO EL DINERO APOSTADO    |");
                  System.out.println(" ---------------------------------------- ");
                  System.out.println("");
                  jugador.setSaldo(jugador.getSaldo() - jugador.getApuesta());
                } else if (manoBanca.getPuntosAcumulados() > 7.5){
                  turnoBanca = false;
                  System.out.println(" ---------------------------------------- ");
                  System.out.println("|   HAS GANADO!! LA BANCA SE HA PASADO   |");
                  System.out.println("|       DUPLICAS EL DINERO APOSTADO      |");
                  System.out.println(" ---------------------------------------- ");
                  System.out.println("");
                  jugador.setSaldo(jugador.getSaldo() + jugador.getApuesta());
                }
              } while (turnoBanca == true);

              seguirJugando = false;
            }        
    
          } else if (manoJugador.getPuntosAcumulados() > 7.5) {
            System.out.println(" ---------------------------------------- ");
            System.out.println("| HAS PERDIDO, LÍMITE DE PUNTOS SUPERADO |");
            System.out.println("|     PIERDES TODO EL DINERO APOSTADO    |");
            System.out.println(" ---------------------------------------- ");
            System.out.println("");
            jugador.setSaldo(jugador.getSaldo() - jugador.getApuesta());
            seguirJugando = false;
    
          } else if (manoJugador.getPuntosAcumulados() == 7.5) {
            System.out.println(" ------------------------------------ ");
            System.out.println("|    HAS GANADO!! 7,5 CONSEGUIDO!!   |");
            System.out.println("|     DUPLICAS EL DINERO APOSTADO    |");
            System.out.println(" ------------------------------------ ");
            System.out.println("");
            jugador.setSaldo(jugador.getSaldo() + jugador.getApuesta());
            seguirJugando = false;
          }
        } while (seguirJugando == true);

        System.out.print("¿Desea seguir Jugando? (Y/N): ");
        repuestaJugar = System.console().readLine();
        System.out.print("");
      
        if (repuestaJugar.equals("Y") || repuestaJugar.equals("y")) {
          jugar = true;
          System.out.println("");
        } else {
          System.out.println("");
          System.out.println(" ------------------------------ ");
          System.out.println("|       HASTA LA PROXIMA       |");
          System.out.println(" ------------------------------ ");
          jugar = false;
        }

      } else {

        System.out.println(" ------------------------------------ ");
        System.out.println("|              SE ACABO...           |");
        System.out.println("|      TE HAS QUEDADO SIN DINERO     |");
        System.out.println(" ------------------------------------ ");
        System.out.println("");

        System.out.print("¿Desea jugar de nuevo? (Y/N): ");
        repuestaJugar = System.console().readLine();
        System.out.print("");
        
        if (repuestaJugar.equals("Y") || repuestaJugar.equals("y")) {
          jugar = true;
          jugador.setSaldo(500);
          System.out.println("");
          System.out.println(" ------------------------------ ");
          System.out.println("|        SIETE y  MEDIA        |");
          System.out.println(" ------------------------------ ");
          System.out.println("");
        } else {
          System.out.println("");
          System.out.println(" ------------------------------ ");
          System.out.println("|       HASTA LA PROXIMA       |");
          System.out.println(" ------------------------------ ");
          jugar = false;
        }
       
      }
    } while (jugar == true);
    
  }
}
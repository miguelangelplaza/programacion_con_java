package examen;

/**
 * Ejercicio02
 */
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del jugador 1: ");
        String jugador1 = scanner.nextLine();
        System.out.print("Nombre del jugador 2: ");
        String jugador2 = scanner.nextLine();

        
        int longitudMaxima = Math.max(jugador1.length(), jugador2.length()) + 4;

        int puntosJugador1 =1 ;
        int puntosJugador2 =1;

        
        while (puntosJugador1 < 3 && puntosJugador2 < 3) {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            
            System.out.printf("%-" + longitudMaxima  + "s|%-" + (longitudMaxima - 4) + "s%n", jugador1, jugador2);
            System.out.println("-".repeat(longitudMaxima) + "|" + "-".repeat(longitudMaxima - 4));
            
            String jugada1;
            do {
                System.out.print(jugador1 + ", introduce tu jugada (piedra, papel o tijera): ");
                jugada1 = scanner.nextLine();
            } while (!jugada1.equals("piedra") && !jugada1.equals("papel") && !jugada1.equals("tijera"));
            
            String jugada2;
            do {
                System.out.print(jugador2 + ", introduce tu jugada (piedra, papel o tijera): ");
                jugada2 = scanner.nextLine();
            } while (!jugada2.equals("piedra") && !jugada2.equals("papel") && !jugada2.equals("tijera"));

            
            String resultado = determinarGanador(jugada1, jugada2);
            System.out.println("Resultado: " + resultado);

            
            if (resultado.equals(jugador1)) {
                puntosJugador1++;
            } else if (resultado.equals(jugador2)) {
                puntosJugador2++;
            }
        }
        
        if (puntosJugador1 == 3) {
            System.out.println(jugador1 + " ha ganado el juego!");
        } else {
            System.out.println(jugador2 + " ha ganado el juego!");
        }

        scanner.close();
       }   
    
    
      
      String determinarGanador = resultado( jugada1, jugada2);
      if (jugada1.equals(jugada2)) {
            return "Empate";
        } else if ((jugada1.equals("piedra") && jugada2.equals("tijera")) ||
                   (jugada1.equals("papel") && jugada2.equals("piedra")) ||
                   (jugada1.equals("tijera") && jugada2.equals("papel"))) {
            return "Gana el jugador 1";
        } else {
            return "Gana el jugador 2";
        }
      

  }
  



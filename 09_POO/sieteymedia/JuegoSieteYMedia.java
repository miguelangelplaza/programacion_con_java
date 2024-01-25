package sieteymedia;

/**
 * SieteYMedia
 */
import java.util.Scanner;

public class JuegoSieteYMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al juego de Siete y Media!");

        jugarPartida(scanner);

        System.out.println("¡Hasta luego!");
    }

    private static void jugarPartida(Scanner scanner) {
        Baraja baraja = new Baraja();
        Jugador jugador = new Jugador(100.0);

        System.out.println("\nNuevo juego comenzado.");

        while (jugador.tieneSaldoSuficiente() && jugador.jugarTurno(baraja, scanner)) {
            jugarTurnoBanca(baraja, jugador);
            determinarGanador(jugador);
        }

        System.out.println("Tu saldo final es: " + jugador.getSaldo());
    }

    private static void jugarTurnoBanca(Baraja baraja, Jugador jugador) {
        while (jugador.jugarTurnoBanca(baraja)) {
        }
    }

    private static void determinarGanador(Jugador jugador) {
        double puntuacionJugador = jugador.getMano().calcularPuntuacion();
        double puntuacionBanca = jugador.getMano().calcularPuntuacion();

        if (puntuacionJugador <= 7.5 && (puntuacionBanca > 7.5 || puntuacionJugador > puntuacionBanca)) {
            System.out.println("¡Has ganado! Se añade la apuesta a tu saldo.");
            jugador.incrementarSaldo(puntuacionJugador);
        } else {
            System.out.println("¡Has perdido! Se resta la apuesta de tu saldo.");
            double getSaldo = 0; 
        }
    }
}
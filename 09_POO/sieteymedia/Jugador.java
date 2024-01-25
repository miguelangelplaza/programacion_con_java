package sieteymedia;


/**
 * Jugador
 */
import java.util.Scanner;

public class Jugador {
    private Mano mano;
    private double saldo;

    public Jugador(double saldoInicial) {
        mano = new Mano();
        saldo = saldoInicial;
    }

    public void realizarApuesta(Scanner scanner) {
        // Lógica para realizar la apuesta
    }

    public Mano getMano() {
        return mano;
    }

    public double getSaldo() {
        return saldo;
    }

    public void incrementarSaldo(double cantidad) {
        saldo += cantidad;
    }

    public void decrementarSaldo(double cantidad) {
        saldo -= cantidad;
    }

    public boolean tieneSaldoSuficiente() {
        return saldo > 0;
    }

    public boolean jugarTurno(Baraja baraja, Scanner scanner) {
        // Lógica para el turno del jugador
        return true; // Devuelve true si el jugador decide recibir otra carta
    }

    public boolean jugarTurnoBanca(Baraja baraja) {
        // Lógica para el turno de la banca
        return getMano().calcularPuntuacion() < 7.5;
    }
}

package sieteymedia;

/**
 * SieteYMedia
 */
import java.util.Scanner;

public class SieteYMedia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

		System.out.println("¡Bienvenido a Siete y Media!");
		Baraja baraja = new Baraja();
        baraja.barajar();

        for (int i = 0; i < 5; i++) {
            Carta carta = baraja.repartir();
            System.out.println("Carta " + (i + 1) + ": " + carta + " - Puntuación: " + carta.Puntuacion());
        }

		sc.close();
  }
}
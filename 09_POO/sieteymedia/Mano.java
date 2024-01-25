package sieteymedia;

/**
 * Mano
 */
import java.util.ArrayList;
import java.util.List;

public class Mano {
    private List<Carta> cartas;

    public Mano() {
        cartas = new ArrayList<>();
    }

    public void recibirCarta(Baraja baraja) {
        Carta carta = baraja.repartirCarta();
        if (carta != null) {
            cartas.add(carta);
        }
    }

    public double calcularPuntuacion() {
        return cartas.stream().mapToDouble(Carta::getPuntuacion).sum();
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}

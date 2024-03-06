package ejemplos;

import java.util.ArrayList;

/**
 * MainCarta
 */




public class MainCarta {
public static void main(String[] args) {
    ArrayList<Carta> baraja = new ArrayList<>();
    Carta c = new Carta();
    baraja.add(c);

    for (int i = 0; i < 9; i++) {
        do {
            Carta nueva = new Carta();
            
        } while (baraja.contains(nueva));
    }

}

    
}
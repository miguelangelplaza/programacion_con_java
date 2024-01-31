package sieteymedia;


/**
 * Baraja    
 * necesita: palos 
 * valores/ numeros 
 * 40 cartas (89 fuera)
 * cartas (array de objetos cartas)
 * constructor se crea el array de 40 cartas 
 * inicializar numero de cartas 
 * incializar la baraja (crear la baraja (bucles))
 * barajar 
 * estraer carta 
 * puntuacion de la carta 
 * 
 * mostar baraja por pantalla 
 *  
 * 
 * 
 */
import java.util.Random;

class Baraja {

    //Atributos
    private Carta[] cartas;
    private static final int NUM_CARTAS = 40;
    private int index;

    // Constructor
    public Baraja() {

        cartas = new Carta[NUM_CARTAS];

        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] numeros = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};

        index = 0;
        for (String palo : palos) {
            for (String numero : numeros) {
                cartas[index] = new Carta(palo, numero);
                index++;
            }
        }
    }

    //Metodos

    public void barajar() {
        Random rand = new Random();
        for (int i = cartas.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Carta temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }
        index = 0;
    }

    public Carta repartir() {
        if (index < cartas.length) {
            return cartas[index++];
        } else { 
            return null;
        }
    }
}
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

 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.List;
 
 public class Baraja {
     private List<Carta> cartas;
 
     public Baraja() {
         cartas = new ArrayList<>();
         inicializarBaraja();
     }
 
     private void inicializarBaraja() {
         String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
         String[] valores = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
 
         for (String palo : palos) {
             for (String valor : valores) {
                 cartas.add(new Carta(palo, valor));
             }
         }
     }
 
     public void barajar() {
         Collections.shuffle(cartas);
     }
 
     public Carta repartirCarta() {
         return cartas.isEmpty() ? null : cartas.remove(0);
     }
 
     public List<Carta> getCartas() {
         return cartas;
     }
 }


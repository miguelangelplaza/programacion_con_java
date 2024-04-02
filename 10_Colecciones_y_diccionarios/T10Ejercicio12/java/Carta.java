package T10Ejercicio12.java;

// Escribe un programa que genere una secuencia de 5 cartas de la baraja
// española y que sume los puntos según el juego de la brisca. El valor de las
// cartas se debe guardar en una estructura HashMap que debe contener parejas
// (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
// estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
// de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4;
// el resto de cartas no vale nada.

// Ejemplo:
// as de oros
// cinco de bastos
// caballo de espadas
// sota de copas
// tres de oros
// Tienes 26 puntos

public class Carta implements Comparable<Carta>{
    private static String[] p = {"Oros", "Bastos", "Espadas", "Copas"};
    private static String[] n = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
  
    private String palo;
    private String valor;
  
    public Carta(){
      this.palo = p[(int)(Math.random()*4)];
      this.valor = n[(int)(Math.random()*10)];
    }
  
    public String getPalo() {
      return palo;
    }
  
    public String getValor() {
      return valor;
    }
  
    @Override
    public String toString() {
      return valor + " de " + palo;
    }
  
    @Override
    public boolean equals(Object obj) {
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Carta other = (Carta) obj;
      if (!valor.equals(other.valor))
        return false;
      if (!palo.equals(other.palo))
        return false;
      return true;
    }
    
    @Override
    public int compareTo(Carta c) {
      if (this.palo.equals(c.getPalo())) {
        return this.valor.compareTo(c.getValor());
      } else {
        return this.palo.compareTo(c.getPalo());
      }
    }
  }


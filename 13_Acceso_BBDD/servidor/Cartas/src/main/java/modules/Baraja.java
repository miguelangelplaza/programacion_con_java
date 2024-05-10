package modules;

public class Baraja{
  ////Atributos
  private String [] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private String [] valores = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
  private Carta[] cartas;
  private int numCartas;

  ////Constructor
  public Baraja(){
    numCartas = this.palos.length * this.valores.length; 
    cartas = new Carta[numCartas];
    inicializaBaraja();
  }

  ////Métodos
  public void inicializaBaraja(){
    int indice = 0;
    while (indice < numCartas) {
      for (int i = 0; i < palos.length; i++) {
        for (int j = 0; j < valores.length; j++) {
          cartas[indice] = new Carta(valores[j], palos[i]);
          indice++;
        }
      }
    }
  }


  public void barajar(){
    int posAleatoria = 0;
    Carta c;
    for (int i = 0; i < cartas.length; i++) {

      posAleatoria = (int) (Math.random() * 40);

      //intercambio
      c = cartas[i];
      cartas[i] = cartas[posAleatoria];
      cartas[posAleatoria] = c; 
    }
  }

  public void eliminarJugada(){
    Carta temp = cartas[0];
    for (int i = 0; i < cartas.length - 1; i++) {
        cartas[i] = cartas[i + 1];
    }
    cartas[cartas.length - 1] = temp;
  }

  public Carta sacarCarta(){
    Carta cartaSacada = cartas[0]; 
    return cartaSacada;
  }
  
}
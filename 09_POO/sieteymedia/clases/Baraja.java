package src.clases;
/**
 * Clase Baraja Juego Siete y Media
 * 
 * @author Francisco Javier Cabello Rueda & Miguel Ángel Plaza
 */

public class Baraja {
  
  //Atributos

  private String [] palos = {"Oros", "Copas", "Espadas", "Bastos"};
  private String [] numeros = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};
  private Carta [] cartas;
  private int numCartas;
  private Carta cartaExtra;

  //Constructor

  public Baraja(){
    numCartas = palos.length * numeros.length;  //Inicializamos el número de cartas multiplicando los palos por  los numeros
    cartas = new Carta[numCartas];              //Declaramos un objeto con el numero de cartas
    inicializaBaraja();                         //LLamamos al metodo inicializaBaraja
  }

  //Métodos
  
  private void inicializaBaraja(){
    int indice = 0;                                     //declaramos el indice
    while(indice < numCartas){                          //mientras el indice sea menor al numero de cartas lo repite
        for(int i = 0; i < palos.length; i++){          //recorre el array de palos y numeros
            for (int j = 0; j < numeros.length; j++) {
                cartas[indice] = new Carta( numeros[j], palos[i], puntuacionCarta(j));
                indice++;
            }
        }
    }
  }

  public double puntuacionCarta(int j){         //Devuelve la puntuacion de la carta en funcion de su numero
    return j<7 ? j+1 : 0.5;
  } 

  public void mostrarBaraja(){                  //Muestra las cartas de la Baraja
    for (int i = 0; i < numCartas; i++) {
        System.out.println(cartas[i].toString());
    }
  }
  
  public Carta repartir(){                     //Reparte una carta aleatoria
    int numero = (int)(Math.random()*cartas.length);
    return cartas[numero];
  }

  public void barajar(){                       //Baraja las cartas de forma aleatoria
    for (int i = 0; i < cartas.length; i++) {
      int indice = (int)(Math.random()*cartas.length);
      cartaExtra = cartas[i];                 //Guarda la carta de la posicion i
      cartas[i] = cartas[indice];             //Sustituye la carta i por una aleatoria
      cartas[indice] = cartaExtra;            //En la posicion de la carta aleatoria se situa la carta i
    }
  }

  public void verCarta(Carta carta){          //Visualiza la carta repartida
    System.out.print(carta);
  }
}

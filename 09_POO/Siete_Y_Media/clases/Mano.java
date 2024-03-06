package clases;
/**
 * Clase Mano Juego Siete y Media
 * 
 * @author Francisco Javier Cabello Rueda & Miguel Ángel Plaza
 */

public class Mano {

  //Atributos

  private double puntosAcumulados;

  //Constructor

  public Mano() {
    this.puntosAcumulados = 0;
  }

  //Getters

  public double getPuntosAcumulados() {     //Establece los puntos acumulados
    return puntosAcumulados;
  }

  //Setters

  public void setPuntosAcumulados(int puntosAcumulados) {  //Establece los puntos acumulados
    this.puntosAcumulados = puntosAcumulados;
  }

  //Métodos
  
  public void acumula(Carta cartaEnJuego){                //Acumula los puntos
    puntosAcumulados += cartaEnJuego.getPuntuacion();
  }
}
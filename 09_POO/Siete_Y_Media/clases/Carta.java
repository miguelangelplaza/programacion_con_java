package clases;
/**
 * Clase Carta Juego Siete y Media
 * 
 * @author Francisco Javier Cabello Rueda & Miguel Ángel Plaza
 */

public class Carta {

  //Atributos

  private String numero;  
  private String palo;
  private double puntuacion;
  
  //Construcor

  public Carta (String numero, String palo, double puntuacion){ 
    this.numero = numero;
    this.palo = palo;
    this.puntuacion = puntuacion;    
  }

  //Getters

  public String getnumero() {    //Obtiene el numero de la carta
    return numero;
  }

  public String getPalo() {     //Obtiene el palo de la carta
    return palo;
  }

  public double getPuntuacion() {   //Obtiene la puntuación de la carta
    return puntuacion;
  }

  //Escribe los atributos de la carta
  @Override
  public String toString() {
    return String.format("%s de %s     Puntuación: %.1f", numero, palo, puntuacion);
  }
}

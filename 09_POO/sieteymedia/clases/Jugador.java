package src.clases;
/**
 * Clase Jugador Juego Siete y Media
 * 
 * @author Francisco Javier Cabello Rueda & Miguel Ángel Plaza
 */

public class Jugador {
  
  //Atributos

  private int saldo;
  private int apuesta;            

  //Constructor

  public Jugador(){
    this.saldo = 500;
    this.apuesta = 0;
  }

  //Getters

  public int getSaldo() {
    return saldo;
  }
  public int getApuesta() {
    return apuesta;
  }

  //Setters

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

  public void setApuesta(int apuesta) {
    this.apuesta = apuesta;
  }
}
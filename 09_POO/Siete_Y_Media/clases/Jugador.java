package clases;
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

  public int getSaldo() {    //Devuelve el saldo del jugador
    return saldo;
  }
  public int getApuesta() {  //Devuelve la apuesta del jugador
    return apuesta;
  }

  //Setters

  public void setSaldo(int saldo) {   //Establece el Saldo del jugador
    this.saldo = saldo;
  }

  public void setApuesta(int apuesta) {    //Establece la apuesta del jugador
    this.apuesta = apuesta;
  }
}
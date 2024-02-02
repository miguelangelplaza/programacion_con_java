package ejercicios.ejercicio9;

/**
 * Movil
 */
public class Movil {
  private String tarifa; 
  private double gastado;

  ////////Constructor
  public Movil(String numero, String tarifa) {
    super(numero); //llamo al contrustor public terminal() del padre 
    this.tarifa = tarifa;
    this.gastado = 0;
  } 

  @Override
  public void llama(Terminal t, int tiempoConversacion){
    super.llama(t, tiempoConversacion);
    double minutos = (double) tiempoConversacion / 60; 

    switch (this.tarifa) {
      case "rata":
        totalGastado = minutos * 0.06;
        break;
      case "mono":
        totalGastado = minutos * 0.12;
        break;
      case "bisonte":
        totalGastado = minutos * 0.30;
        break;    
    
    }

    

  }

  @Override
  public String toString(){
    super.toString() + String.format(" - tarificados %.2f euros ") + " - tarificados" + totalGastado + " euros";
  }
  



  
}
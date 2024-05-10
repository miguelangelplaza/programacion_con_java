package modules;
public class Carta {

  ////Atributos
  private String numero;
  private String palo;
  private final String EXTENSION = ".png";
  
  ////Constructor
  public Carta(String numero, String palo) {
    this.numero = numero;
    this.palo = palo;
  }

  ////Getter
  public String getNumero() {
    return this.numero;
  }

  public String getPalo() {
    return this.palo;
  }

  @Override
  public String toString() {
    return "<img src=\"./assets/img/" + this.numero + "_" + this.palo + EXTENSION +"\" />";
  } 
}
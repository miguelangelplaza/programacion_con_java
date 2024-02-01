package ejercicios;

/**
 * CuentaCorriente
 */
public class CuentaCorriente {


  ///atributos 
  // private int numero; 
  private String numero = " "; 
  private double saldo; 


  ///constructores 
  public CuentaCorriente(){
    generarAleatorio(); 
  }



  public CuentaCorriente(double saldoInicial){
    generarAleatorio(); 
  }


  private void generarAleatorio(){
    for (int i = 0; i < 10; i++) {
      numero += (int)(Math.random()*10);
    }
  }
  

  public static void main(String[] args) {
    String iban = ""; 
    for (int i = 0; i < 10; i++) {
      iban += (int)(Math.random()*10);
    }

    System.out.println("Nº Cuenta: " + iban);
  }

  public void ingreso (double cantidad){
    this.saldo += cantidad; 
  }

  public void cargo (double cantidad){
    this.saldo += cantidad; 
  }    
  
  public void transferencia (CuentaCorriente destino, double cantidad){
    destino.saldo += cantidad;  
    this.saldo -= cantidad; 
    
  }


/////getters 
  public double getSaldo() {
    return saldo;
  }



////tostring
  @Override
  public String toString() {
    return "Numero de cuenta: " + numero + " saldo: " + saldo ;

    // return "CuentaCorriente [numero=" + numero + ", saldo=" + saldo + "]";
  }


  
}
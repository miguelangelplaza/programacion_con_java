package ejercicios;

/**
 * T04Ejercicio02
 * 
 * @author Miguel Angel Plaza Rueda 
 */
public class T04Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días");
    } else if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes");
    } else if (((hora >= 21) && (hora < 24)) || ((hora >= 0) && (hora <= 5))){
      System.out.println("Buenas noches");
    } else{
      System.out.println("La hora introducida no es correcta.");
    }
  }
}
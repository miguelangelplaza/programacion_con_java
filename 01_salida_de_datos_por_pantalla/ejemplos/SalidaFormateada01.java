/**
 * Salida Formateada utilizando enteros, decimales y decimales con precision 
 * 
 * 
 * 
 */
public class SalidaFormateada01 {
  
  public static void main(String[] args) {
    System.out.printf("El numero %d no tiene decimales.\n", 21);
    System.out.printf("El numero %f sale con decimales.\n", 21.0);
    System.out.printf("El %.3f sale exactamente con porcentaje %d decimales.\n",50.0, 3);
    System.out.printf("Letra: %c.\n", 85);

    System.out.printf("Mostramos el segundo argumento: %2$d \n Y despues el primero: %1$.2f", 23.0, 56);
  }

  
}
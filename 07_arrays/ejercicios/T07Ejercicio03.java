package ejercicios;

/**
 * T07Ejercicio03 bidimensional (arrays)
 */
public class T07Ejercicio03 {
public static void main(String[] args) {
  int[][] tabla = new int[4][5];
  int fila;
  int columna; 

  //RELLENAR EL ARRAY 
  for (fila = 0; fila <tabla.length; fila++) {
    for (columna = 0; columna < tabla[fila].length; columna++){
      tabla[fila][columna] = 0;
    }
      
  }
}
  
}
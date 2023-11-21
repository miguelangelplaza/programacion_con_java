package ejercicios;

/**
 * T04Ejercicio04
 * 
 * @author Miguel Angel Plaza Rueda 
 */
public class T04Ejercicio04 {
  public static void main(String[] args) {
    int sueldoSemanal;
    System.out.print("Introduce el número de horas semanales trabajadas: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());

    if (horasTrabajadas <= 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
    }
    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " €");
  }
}


/**
 * T03Ejercicio08 // Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
 * 
 * 
 */
import java.util.Scanner;
public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.print("Ingrese el número de horas trabajadas en la semana: ");
    double horasTrabajadas = scanner.nextDouble();
  
    // Definir la tarifa por hora
     double tarifaPorHora = 12.0;
  
    // Calcular el salario semanal
     double salarioSemanal = horasTrabajadas * tarifaPorHora;
  
    System.out.println("El salario semanal del empleado es: " + salarioSemanal + " euros");
  
    // Cerrar el scanner
    scanner.close();
   }
}


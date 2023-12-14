package examen;

/**
 * Ejercicio03
 */
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("El numero introducido no es valido. Debe ser un numero entero positivo.");
        } else {

            int sumaDivisores = 1;                       // se suma todo incluido el 1 
            System.out.print("Los divisores propios de " + numero + " son: ");
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                    System.out.print(i + " ");


                }

            }

            System.out.println("\nSuma de los divisores propios y el 1: " + sumaDivisores);  

            if (sumaDivisores == numero) {
                System.out.println("Es un número perfecto.");
            } else {
                System.out.println("No es un número perfecto.");
            }
        }

        scanner.close();
    }
}

package examen;
/**
 * Ejercicio01
 * 
 * 
 * @author Miguel Angel Plaza Rueda 
 */
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            System.out.println("-D-I-V-I-N-A-R-E-M-");
            int intervaloMin = solicitarNumero("Introduzca el mínimo valor del intervalo: ");
            int intervaloMax = solicitarNumero("Introduzca el máximo valor del intervalo: ");

            int numeroPensado = generarNumeroAleatorio(intervaloMin, intervaloMax);

            System.out.println("-D-I-V-I-N-A-R-E-M-");
            System.out.println("Estoy pensando en un número entre " + intervaloMin + " y " + intervaloMax);

            int intentosMaximos = (int)(Math.log(intervaloMax-intervaloMin+1) / Math.log(2));

            System.out.println("Tienes " + intentosMaximos + " intentos");

            int intentosRealizados = 0;
            boolean acertado = false;

            while (intentosRealizados < intentosMaximos && !acertado) {
                int numeroUsuario = solicitarNumero("Escribe el número: ");

                if (numeroUsuario == numeroPensado) {
                    acertado = true;
                    System.out.println("Enhorabuena!!!!!!! Has acertado");
                    System.out.println("Efectivamente el numero era: " + numeroPensado);
                } else {
                    System.out.println((numeroUsuario < numeroPensado) ? "Te has quedado corto" : "Te has pasado");
                }

                intentosRealizados++;
            }

            if (!acertado) {
                System.out.println("Has superado el numero de intentos");
                System.out.println("El numero que habia pensado era: " + numeroPensado);
            }




            System.out.println("Elige una opcion");
            System.out.println("1. Volver a jugar");
            System.out.println("2. Salir del juego");

            int opcion = solicitarNumero("Opción: ");

            if (opcion == 2 ) {
                jugarDeNuevo = false;
            }
        }

        System.out.println("Gracias por jugar a -D-I-V-I-N-A-R-E-M-");
    }

    private static int solicitarNumero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextInt();



    }

    private static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);

    }

    private static int calcularIntentosMaximos(int intervaloMax, int intervaloMin) {
        return (int) (Math.log(intervaloMax - intervaloMin + 1) / Math.log(2));



    }








}


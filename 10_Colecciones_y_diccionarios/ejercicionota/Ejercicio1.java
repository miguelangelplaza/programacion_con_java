package ejercicionota;

/**
 * Ejercicio1
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Map<String, String> capitales = new HashMap<>();

        capitales.put("Albania", "Tirana");
        capitales.put("Alemania", "Berlin");
        capitales.put("Andorra", "Andorra La Vieja");
        capitales.put("Belgica", "Bruselas");
        capitales.put("Eslovenia", "liubliana");
        capitales.put("España", "Madrid");
        capitales.put("Estonia","Tallin");
        capitales.put("Francia", "Paris");
        capitales.put("Italia", "Roma");
        capitales.put("Letonia", "Riga");

        // Collections.shuffle(capitales);

        ArrayList<String> respuestasIncorrectas = new ArrayList<>();

        respuestasIncorrectas.add("Lisboa");
        respuestasIncorrectas.add("Reikiavik");
        respuestasIncorrectas.add("Vaduz");
        respuestasIncorrectas.add("Dublin");
        respuestasIncorrectas.add("Bratislava");
        respuestasIncorrectas.add("Vilna");
        respuestasIncorrectas.add("Luxemburgo");
        respuestasIncorrectas.add("Skopie");
        respuestasIncorrectas.add("La Valeta");
        respuestasIncorrectas.add("Chisinau");
        respuestasIncorrectas.add("Monaco");
        respuestasIncorrectas.add("Oslo");
        respuestasIncorrectas.add("Amsterdam");
        respuestasIncorrectas.add("Varsovia");
        respuestasIncorrectas.add("Londres");
        respuestasIncorrectas.add("Estocolmo");
        respuestasIncorrectas.add("Kiev");
        respuestasIncorrectas.add("Ankara");
        respuestasIncorrectas.add("Moscu");
        respuestasIncorrectas.add("Atenas");

        Collections.shuffle(respuestasIncorrectas);

       
        ArrayList<String> opciones = new ArrayList<>(respuestasIncorrectas.subList(0, 2));

        opciones.add(capitales.get("Albania")); 


        Collections.shuffle(opciones);


        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        for (String pais : capitales.keySet()) {

            String capitalCorrecta = capitales.get(pais);


            opciones.set(2, capitalCorrecta);

            // Collections.shuffle(opciones);
            
            
            System.out.println("¿Cuál es la capital de " + pais + "?");

            
            for (int i = 0; i < opciones.size(); i++) {
                System.out.println((i + 1) + ". " + opciones.get(i));
            }

            int respuestaJugador;
            do {
                System.out.print("Respuesta: ");

                respuestaJugador = scanner.nextInt();

            } while (respuestaJugador < 1 && respuestaJugador > 3);

            if (opciones.get(respuestaJugador - 1).equals(capitalCorrecta)) {
                puntos++;
            
        }
    }



    if (puntos >= 5) {
        System.out.println("\n Enhorabuena, ¡Has aprobado!  Puntuación: " + puntos + ".");
    } else {
        System.out.println("Lo siento, ¡Has perdido!  Puntuación: " + puntos + "." );
    }

    
  }

    
}
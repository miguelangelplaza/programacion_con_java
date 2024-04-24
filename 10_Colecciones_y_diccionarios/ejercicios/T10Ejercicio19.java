//package ejercicios; 

/**
 * T10Ejercicio19
 */
import java.util.HashMap;
import java.util.*;
public class T10Ejercicio19 {
    public static void main(String[] args) {
        Map<String, String> diccionarioEspIng = new HashMap<>();
        diccionarioEspIng.put("caliente", "hot");
        diccionarioEspIng.put("ardiente", "hot");
        diccionarioEspIng.put("abrasador", "hot");
        // Agregar más palabras aquí

        Map<String, List<String>> diccionarioIngEsp = new HashMap<>();
        for (Map.Entry<String, String> entrada : diccionarioEspIng.entrySet()) {
            String palabraEsp = entrada.getKey();
            String palabraIng = entrada.getValue();

            if (!diccionarioIngEsp.containsKey(palabraIng)) {
                diccionarioIngEsp.put(palabraIng, new ArrayList<>());
            }

            diccionarioIngEsp.get(palabraIng).add(palabraEsp);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Introduzca una palabra y le daré los sinónimos:");
            String palabra = scanner.nextLine();

            if (palabra.equals("salir")) {
                break;
            }

            if (!diccionarioEspIng.containsKey(palabra)) {
                System.out.println("No conozco esa palabra");
                continue;
            }

            String palabraIng = diccionarioEspIng.get(palabra);
            List<String> sinonimos = new ArrayList<>(diccionarioIngEsp.get(palabraIng));
            sinonimos.remove(palabra);

            if (sinonimos.size() == 0) {
                System.out.println("No conozco sinónimos de esa palabra");
            } else {
                System.out.println("Sinónimos de " + palabra + ": " + String.join(", ", sinonimos));
            }
        }
    }
}
    
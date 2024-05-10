import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

///Convertir un fichero (clave-valor) a hashmap y sacarlo por pantalla 


public class Ejercicio2examen {
    public static void main(String[] args) {
        String filePath = "REPASO EXAMEN/ficherito/clave-valor.txt"; // Reemplaza esto con la ruta a tu archivo

        HashMap<String, String> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    map.put(key, value);
                } else {
                    System.out.println("ignorando línea: " + line);
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
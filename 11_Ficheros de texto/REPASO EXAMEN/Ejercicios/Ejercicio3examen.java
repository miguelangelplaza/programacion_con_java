import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

///Convertir un fichero (clave-valor) a dos Arraylist y estos a fichero de salida claves.txt y valores.txt

public class Ejercicio3examen {
    public static void main(String[] args) {
        String filePath = "REPASO EXAMEN/ficherito/clave-valor.txt"; 

        ArrayList<String> keys = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    keys.add(key);
                    values.add(value);
                } else {
                    // System.out.println("ignorando línea: " + line);
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("REPASO EXAMEN/ficherito/claves.txt"))) {
            for (String key : keys) {
                bw.write(key);
                bw.newLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("REPASO EXAMEN/ficherito/valores.txt"))) {
            for (String value : values) {
                bw.write(value);
                bw.newLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
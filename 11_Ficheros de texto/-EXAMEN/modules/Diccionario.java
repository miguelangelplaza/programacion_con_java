package modules;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;


/**
 * @author Sergio Sánchez Martín
 */

public class Diccionario implements DiccionarioInterface {

  private HashMap<String, String> diccionario = new HashMap<>();

  public Diccionario() {
    diccionario = new HashMap<>();
  }

  @Override
  public boolean buscar(String palabra) {
    return diccionario.containsKey(palabra); //Mediante el boolean se obtiene si la palabra esta definida o no en el diccionario devolviendo true o false 
  }
   
  @Override
  public void anadir (String palabra, String significado) { //Con este metodo añadimos una palabra al diccionario con su significado
    diccionario.put(palabra, significado); //Con el put añadimos la palabra al diccionario con su significado
    System.out.println("Palabra añadida al diccionario"); //Con el sysout imprimimos por pantalla el mensaje de que la palabra ha sido añadida
  }


  @Override
  public void listar() {
    System.out.println("Palabras en el diccionario: "); //Imprimimos el mensaje que se muestra por patalla 
    for (String palabra : diccionario.keySet()) { //Esto recorre el diccionario y obtiene las palabras
      System.out.println(palabra); // y con el out print se imprimen las palabras
    }
  }

  @Override
  public void borrar(String palabra) {  //Este es el metodo para borrar una palabra del diccionario
    diccionario.remove(palabra); //Mediante el remove se elimina la palabra del diccionario 
    System.out.println("Palabra borrada del diccionario"); //Con el sysout imprimimos por pantalla el mensaje de que la palabra ha sido elimanada 
  }

  






  @Override 
  public void editar(String palabra, String nuevoSignificado) {  //Con este metodo vamos ha editar una palabra del diccionario para darle otro significado 
    diccionario.put(palabra, nuevoSignificado); //Con el put se añade la palabra con el nuevo significado 
    System.out.println("Significado editado correctamente"); // Y con el sysout imprimos ppor pantalla el mensaje

  }
   
  @Override 
  public String significado(String palabra) { //Con este metodo obtenemos el significado de una palabra 
    return diccionario.get(palabra); //Con el get obtenemos el significado de la palabra 
  }

  @Override
  public void cargar(String archivo) {
    try { BufferedReader br = new BufferedReader(new FileReader(archivo)); //Con el bufferedReader leemos el archivo
      String linea;  //Declaramos la variable linea 
      while ((linea = br.readLine()) != null) {  //hacemos un bucle que mientras que la linea no sea nuta se ejecute 
        String[] partes = linea.split(":");  //Con esto se divide la linea en dos partes 
        if (partes.length == 2) {  //Si la longitud de las partes es igual a 2 entonces: 
          String palabra = partes[0]; //La primera parte es la palabra
          String significado = partes[1];  //La segunda parte es el significado
          diccionario.put(palabra, significado);  //Con el put añadimos la palabra y el significado al diccionario
        }
      }
      br.close();  // cerramos el bufferedReader
      System.out.println("Diccionario cargado correctamente desde el archivo");  // se imprime por pantalla el mesaje 
    } catch (IOException ioe) { // con el catch se ejecuta la excepcion para que no de error
      System.out.println("Error al cargar el diccionario"); // en el caso que de error sale por pantalla el mensaje
    }
  }

  @Override
  public void guardar(String archivo) {
    try { FileWriter fw = new FileWriter(archivo); //Con el fileWriter se escribe en el archivo
      for (Map.Entry<String, String> entrada : diccionario.entrySet()) { //Con el for recorremos el diccionario
        fw.write(entrada.getKey() + ":" + entrada.getValue() + "\n"); //Con el write se escribe la palabra y el significado en el archivo
      }
      fw.close(); //Con el close cerramos el fileWriter
      System.out.println("Diccionario guardado correctamente en el archivo"); //Con el sysout se imprime por pantalla el mensaje
    } catch (IOException ioe) { //Con el catch se ejecuta la excepcion para que no de error
      System.out.println("Error al guardar el diccionario"); //En el caso que de error se imprime por pantalla el mensaje
    }
  }

  @Override
  public void ordenarAlfabeticamente() { 
    ArrayList<String> palabrasOrdenadas = new ArrayList<>(diccionario.keySet());  //Se crea un arraylist con las palabras del diccionario 
    Collections.sort(palabrasOrdenadas); //Con el collections.sort se ordenan las palabras alfabeticamente
    System.out.println("Palabras en el diccionario ordenadas alfabéticamente:"); //Se muestra por pantalla el mensaje 
    for (String palabra : palabrasOrdenadas) { //Con el for recorremos el arrylist de las palabras ordenadsa
      System.out.println(palabra); //y mediante el sysout se imprimen por pantalla las palabras ordenadas
    }
  }


}
package ejercicios;

/**
 * T04Ejercicio12
 * 
 * @author miguel angel plaza rueda 
 */
public class T04Ejercicio12 {
  public static void main(String[] args) {
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO DE 1º DAw");
    
    System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
    System.out.println("a) int\nb) double\nc) float"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta == "b") {
      System.out.println("Correcto");
      puntos++;     //Aumentamos el valor de puntos en 1 unidad
    } else {
      System.out.println("Incorrecto");
    }

    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
    System.out.println("a) XML\nb) SELECT\nc) SQL"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {
      System.out.println("Correcto");
      puntos++;     //Aumentamos el valor de puntos en 1 unidad
    } else {
      System.out.println("Incorrecto");
    }

    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a) href\nb) a\nc) link"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      System.out.println("Correcto");
      puntos++;     //Aumentamos el valor de puntos en 1 unidad
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("4. ¿En qué directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a) /etc\nb) /config\nc) /cfg"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      System.out.println("Correcto");
      puntos++;     //Aumentamos el valor de puntos en 1 unidad
    } else {
      System.out.println("Incorrecto");
    }
    
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM"); 
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
      System.out.println("Correcto");
    } else {
      System.out.println("Incorrecto");
    }

    System.out.println("\nHa obtenido " + puntos + " puntos.");
  }
}
package ejercicios;

import java.util.HashMap;

/**
 * Ejercicio01
 */
public class Ejercicio01 {

  public static void main(String[] args) {
    HashMap<String, String> bbdd = new HashMap<>();
    String usuario; 
    String pass; 
    boolean accede = false; 
    int intentos = 3; 

    bbdd.put("admin", "1234");
    bbdd.put("fulanito", "daw");
    bbdd.put("menganito", "tarde");
    do {

      System.out.print("Porfavor, Introduce el nombre de usuario: ");
      usuario = System.console().readLine();
      System.out.print("Porfavor, Introduce la contraseña: ");
      pass = System.console().readLine();
      
      if (bbdd.containsKey(usuario)) {    /////usuario existe
         if (bbdd.get(usuario).equals(pass)) {      ////la contraseña coincide 
            System.out.println("Bienvenido a su zona privada");
          
         } else {
            System.out.println("contraseña incorrecta");
            intentos--;
            // System.out.println("Le quedan " + intentos + " intentos");
         }
      } else {
        System.out.println("Usuario no registrado");
        intentos--;
        // System.out.println("Le quedan " + intentos + " intentos");
      }

      if (!accede && intentos > 0) {
        System.out.println("Le quedan " + intentos + " intentos");
      }

      // intentos--;
    } while (!accede && intentos > 0 );

    if (!accede) {
      System.out.println("Lo sentimos, no tiene acceso a la zona secreta. ");
      
    }



  }
}

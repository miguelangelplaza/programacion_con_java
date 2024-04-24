import java.util.HashMap;

/**
 * Programa que gestiona usuarios de una zona restringida.
 * Se disponen de 3 intentos.
 * 
 * @author Miguel Angel Plaza 
 */
public class T10Ejercicio01 {
  public static void main(String[] args) {
    HashMap<String, String> bbdd = new HashMap<>();
    String usuario;
    String pass;
    boolean accede = false;
    int intentos = 3;

    bbdd.put("admin", "335533");
    bbdd.put("fulanito", "abcde");
    bbdd.put("menganito", "12345678");

    do {
      System.out.print("Por favor, introduce el nombre de usuario: ");
      usuario = System.console().readLine();
      System.out.print("Introduce la contraseña: ");
      pass = System.console().readLine();

      if (bbdd.containsKey(usuario)) {    //el usuario existe
        if(bbdd.get(usuario).equals(pass)) {    //la contaseña coincide
          System.out.println("Bienvenido a su zona privada");
          accede = true;
        } else {
          System.out.println("Contraseña incorrecta");
          intentos--;
        }
      } else {
        System.out.println("Usuario no registrado");
        intentos--;
      }

      if (!accede && intentos > 0) {
        System.out.println("Le quedan " + intentos + " intentos.");
      }
      
    } while (!accede && intentos > 0);

    if (!accede) {
      System.out.println("Lo sentimos. No tiene acceso a la zona privada");
    }
  }
}
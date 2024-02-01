package ejemplos;

/**
 * AppPersonaEstudiante Clase  que contiene el metodo main para probar la herencia entre personas 
 * 
 */
public class AppPersonaEstudiante {
 
public static void main(String[] args) {
  
  Persona p = new Persona("Pepe Rodriguez", 30, "1234567K");
  Estudiante e = new Estudiante("Paula Gomez", 25, "4435667J");
  Profesor prof = new Profesor("Sergio Sanchez", 34, "988765788K", "Informatica", 10000.25);

  System.out.println(p.toString());
  System.out.println(p);

  System.out.println(e.toString());
  System.out.println(e);

  System.out.println(prof.toString());
  System.out.println(prof.toString());


  // p.mostrarDatos();
  // e.mostrarDatos();





}
  
}
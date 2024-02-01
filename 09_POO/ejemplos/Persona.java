package ejemplos;

/**
 * Persona clase que nos permitira reutilizarla para ver el concepto de hercencia en poo 
 */
public class Persona {

  ///////ATRIBUTOS 
  private String nombre; 
  private int edad ; 
  private String dni;
  

  //////Constructor 
  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }


  ///////GETERS 
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getDni() {
    return dni;
  }


  @Override
  public String toString() {
    return "Nombre: " + nombre + "\tEdad" + edad + "\tDNI: " + dni;
  } 

  // public void mostrarDatos(){
  //   System.out.println("Nombre: " + nombre + "\tEdad" + edad + "\tDNI: " + dni);
  // }


  
  
}
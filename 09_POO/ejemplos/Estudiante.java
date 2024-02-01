package ejemplos;

/**
 * Estidiante  Clase que hereda de la clase persona 
 * 
 */
public class Estudiante extends Persona {
  ///////Atributos 
  private int creditos;


  //////Constructores 
  public Estudiante(String nombre, int edad, String dni, int creditos) {
    super(nombre, edad, dni);
    this.creditos = creditos;
  } 

  public Estudiante(String nombre, int edad, String dni){
    super(nombre, edad, dni);
    this.creditos = 60; 
  }


  ///////GETTERS 
  public int getCreditos() {
    return creditos;
  }



  @Override
  public String toString() {
    return super.toString() + " [Estudiante] Creditos: " + creditos;
  }

  

  // @Override
  // public void mostrarDatos(){
  //   super.mostrarDatos();   ///llama a mostrar datos de personas (super clase) 
  //   System.out.println("Estudiante matriculado de " + creditos + "creditos.");
  // }


}
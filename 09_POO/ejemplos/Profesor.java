package ejemplos;

/**
 * Profesor clase que hereda de persona 
 */
public class Profesor extends Persona {
 ////////Atributos
  private String departamento; 
  private double sueldo;


  ///////CONSTRUCTORES 
  public Profesor(String nombre, int edad, String dni, String departamento, double sueldo) {
    super(nombre, edad, dni);
    this.departamento = departamento;
    this.sueldo = sueldo;
  }


  ////////GETTERS 
  public String getDepartamento() {
    return departamento;
  }


  public double getSueldo() {
    return sueldo;
  }


  //////TOSTRING 
  @Override
  public String toString() {
    return super.toString() + " [Profesor] Departamento: " + departamento;
  }


  

  

}

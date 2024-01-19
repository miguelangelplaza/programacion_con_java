package ejemplos;

/**
 * Cat
 */
public class Cat {

  //Atributos 
  String nombre; 
  String color; 
  String raza; 
  String sexo; 
  int edad; 
  double peso; 


  //constructores
  Cat(String nombre){
    this.nombre = nombre; 
  }

  Cat(String nombre, String color, String raza, String sexo, int edad, double peso){
    this.nombre = nombre; 
    this.color = color; 
    this.raza = raza; 
    this.sexo = sexo; 
    this.edad = edad; 
    this.peso = peso; 
  }

  ///metodos 
  void maulla(){
    System.out.println("Miauuuuuu!!");
  
  } 

  void ronronea(){
    System.out.println("brrrrrrr");
  }

  void come(String comida){
    if (comida.equalsIgnoreCase("Pescado")) {
      System.out.println("Ñam ñam");
    } else {
      System.out.println("Soy un gato y solo como pescado");

    }
  }
    //Pelear dos gatos pero que solo se pelen si son machos 

  void peleaCon(Cat contricante){
   if (this.sexo.equals(contricante.sexo) && this.sexo.equals("macho")) {
    System.out.println("Ven aqui, que te reviento");
   } else {
    System.out.println("No me gusta pelear");
   }

  }

}
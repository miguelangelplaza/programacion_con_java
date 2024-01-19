package ejemplos;

/**
 * PruebaCat
 */
public class PruebaCat {

  public static void main(String[] args) {
    // Cat garfield = new Cat("Garfield");
    // System.out.println(garfield.nombre);


    
    // Cat kitty = new Cat("kitty", "Negro", "Egipcio", "Macho", 5, 4.2);
    // System.out.println(kitty.nombre);
    // System.out.println(kitty.edad);
    // System.out.println(kitty.color);
    // System.out.println(kitty.peso);
    // System.out.println(kitty.sexo);
    // System.out.println(kitty.raza);

    // garfield.sexo = "macho";
    // Cat Kitty = new Cat();
    // Kitty.sexo = "hembra";
    // Cat missy = new Cat();
    // missy.sexo = "hembra"; 

    // garfield.come("Pescado");
    // garfield.maulla();
    // garfield.ronronea();
    // garfield.peleaCon(Kitty);
    // Kitty.peleaCon(missy);


    System.out.println("¿Cuantos gatos quieres crear: ? ");
    String [] nombres = {"garfield", "botas", "willy", "pancho", "misifu"};
    String[] colores = {"marron", "negro", "pardo"}; 

    int num = Integer.parseInt(System.console().readLine());
    Cat[] gaticos = new Cat[num];
   

    for (int i = 0; i < num; i++) {
      int nombreAleatorio = (int)(Math.random()*5);
      int colorAleatorio = (int)(Math.random()*3);
      System.out.println("¿Que raza deseas? ");
      String raza = System.console().readLine();
      
      gaticos[i] = new Cat(nombres[nombreAleatorio], colores[colorAleatorio], raza, "Macho", 0, 0);
    }

    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.out.println(gaticos[i].color);

    }

    
    
  }
}
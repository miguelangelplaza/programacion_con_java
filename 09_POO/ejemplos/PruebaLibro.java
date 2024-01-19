package ejemplos;

/**
 * Clase que contendra el metodo principal o main 
 * 
 * 
 * @author Miguel Angel Plaza Rueda
 */
public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibrito = new Libro(); 
    Libro quijote = new Libro(); 

    lib.titulo = "Atomka"; 
    lib.autor = "Franck Thillez"; 
    lib.numeroPaginas = 490;

    System.out.println("Titulo: "  lib.titulo);
    System.out.println("Author: "  lib.autor);
    System.out.println("Numero de paginas: "  lib.numeroPaginas);
    System.out.println("Edicion: "  lib.edicion);

  }
  
}
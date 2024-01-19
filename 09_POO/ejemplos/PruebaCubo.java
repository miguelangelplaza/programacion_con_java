
/**
 * PruebaCubo
 */
public class PruebaCubo {

  public static void main(String[] args) {
    Cubo cubo = new Cubo(10);
    Cubo cuboDestino = new Cubo(8);

    System.out.println(cubo.toString());
    System.out.println(cuboDestino.toString());

    cubo.setContenido(6);
    cuboDestino.setContenido(1);
    
    cubo.pinta();
    cuboDestino.pinta();

    cubo.vuelcaEn(cuboDestino);

    cubo.pinta();
    cuboDestino.pinta();

  }
}

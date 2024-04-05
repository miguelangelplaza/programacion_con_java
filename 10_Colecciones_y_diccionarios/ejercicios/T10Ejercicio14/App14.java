package ejercicios;
package T10Ejercicio14;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * App14
 *   Un supermercado de productos ecológicos nos ha pedido hacer un programa
     para vender su mercancía. En esta primera versión del programa se tendrán
     en cuenta los productos que se indican en la tabla junto con su precio. Los
     productos se venden en bote, brick, etc. Cuando se realiza la compra, hay que
     indicar el producto y el número de unidades que se compran, por ejemplo
     “guisantes” si se quiere comprar un bote de guisantes y la cantidad, por
     ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra
     “fin. Suponemos que el usuario no va a intentar comprar un producto que
     no existe. Utiliza un diccionario para almacenar los nombres y precios de los
     productos y una o varias listas para almacenar la compra que realiza el usuario.
     A continuación se muestra una tabla con los productos disponibles y sus
     respectivos precios:
 */
public class App14 {
public static void main(String[] args) {
    HashMap<String, Double> productos = new HashMap<String, Double>();
    productos.put("avena", 2.21);
    productos.put("garbanzos", 2.39);
    productos.put("tomate", 1.59);
    productos.put("gengibre", 3.13);
    productos.put("quinoa", 4.50);
    productos.put("guisantes", 1.60);

    ArrayList<String> listadoProductos = new ArrayList<String>();
    ArrayList<Integer> listadoCantidades = new ArrayList<Integer>();
    Boolean continuarBoolean = true;
    String productoIntroducido; 
    Int cantidadIntroducida; 
    double total = 0; 

    do {
        System.out.print("Producto: ");
        productoIntroducido = System.console().readLine();
        if (!productoIntroducido.equalsIgnoreCase("fin")) {
            System.out.print("Cantidad: ");
            cantidadIntroducida = Integer.parseInt(System.console().readLine());
            listadoProductos.add(productoIntroducido);
            listadoCantidades.add(cantidadIntroducida);
        } else {
            continuarBoolean = false; 
        }
    } while (continuarBoolean);

    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");

    for (int i = 0; i < listadoCantidades.size(); i++) {
        String producto = listadoProductos.get(i);
        double precio = productos.get(producto);
        int cantidad = listadoCantidades.get(i);
        double Subtotal = precio * cantidad; 
        total = total + Subtotal; 
        System.out.printf("%-15s %-6.2f %6d %12.2f\n", producto + precio + cantidad + Subtotal);
    }

    System.out.println("-----------------------------------------");
    System.out.println("Total: " + total);
}
    
}
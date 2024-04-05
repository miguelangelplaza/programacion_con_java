/**
 * T10Ejercicio15
 */

 import java.util.ArrayList;
 import java.util.HashMap;
 
public class T10Ejercicio15 {


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
    int cantidadIntroducida; 
    double total = 0; 

    double descuento = 0; 
    boolean hayDescuento = false;

    do {
        System.out.print("Producto: ");
        productoIntroducido = System.console().readLine();
        if (!productoIntroducido.equalsIgnoreCase("fin")) {
            System.out.print("Cantidad: ");
            cantidadIntroducida = Integer.parseInt(System.console().readLine());
            listadoProductos.add(productoIntroducido);
            listadoCantidades.add(cantidadIntroducida);

            //Compruebo si el producto ya esta entre el pedido 
            if (listadoProductos.contains(productoIntroducido)) {
                int posicionProducto = listadoProductos.indexOf(productoIntroducido);
                listadoCantidades.set(posicionProducto, listadoCantidades.get(posicionProducto) + cantidadIntroducida );
            } else {
                listadoProductos.add(productoIntroducido); 
                listadoCantidades.add(cantidadIntroducida);
            }




        } else {
            continuarBoolean = false; 
            System.out.println("Introduzca código de descuento (INTRO si no tiene ninguno): ECODTO");
            String respuesta = System.console().readLine();
            if (respuesta.equals("ECODTO")) {
                hayDescuento = true;
            }
        }
    } while (continuarBoolean);

    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");

    for (int i = 0; i < listadoCantidades.size(); i++) {
        String producto = listadoProductos.get(i);
        double precio = productos.get(producto);
        int cantidad = listadoCantidades.get(i);
        double subtotal = precio * cantidad; 
        total = total + subtotal; 
        System.out.printf("%-15s %-6.2f %6d %12.2f\n", producto, precio, cantidad, subtotal);
    }

    if (hayDescuento) {
        descuento = total /10.0;
        total *= 0.9;
    }


    System.out.println("-----------------------------------------");
    System.out.println("Descuento: %7.2f\n" + descuento);
    System.out.println("-----------------------------------------");
    System.out.println("Total: %7.2f\n" + total);
}

    
}
    


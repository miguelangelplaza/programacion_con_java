package ejercicios;

/**
 * Gestesimal   /// Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el 
 * control de los artículos de un almacén. De cada artículo se debe saber el código,
 * la descripción, el precio de compra, el precio de venta y el stock (número de
 * unidades). El menú del programa debe tener, al menos, las siguientes opciones:
1. Listado
2. Alta
3. Baja
4. Modificación
5. Entrada de mercancía
6. Salida de mercancía
7. Salir 
La entrada y salida de mercancía supone respectivamente el incremento y
decremento de stock de un determinado artículo. Hay que controlar que no
se pueda sacar más mercancía de la que hay en el almacén.
   
 * 
 * 
 * @author Miguel Angel Plaza Rueda
 */
import java.util.Scanner;

public class Gestesimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Almacen almacen = new Almacen();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción mediante números: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    almacen.listarArticulos();
                    break;
                case 2:
                    System.out.print("Ingrese el código del artículo: ");
                    String codigo = scanner.next();
                    System.out.print("Ingrese la descripción del artículo: ");
                    String descripcion = scanner.next();
                    System.out.print("Ingrese el precio de compra del artículo: ");
                    double precioCompra = scanner.nextDouble();
                    System.out.print("Ingrese el precio de venta del artículo: ");
                    double precioVenta = scanner.nextDouble();
                    System.out.print("Ingrese el stock del artículo: ");
                    int stock = scanner.nextInt();
                    almacen.agregarArticulo(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
                    break;
                case 3:
                    System.out.print("Ingrese el código del artículo a eliminar: ");
                    String codigoEliminar = scanner.next();
                    almacen.eliminarArticulo(codigoEliminar);
                    break;
                case 4:
                    System.out.print("Ingrese el código del artículo a modificar: ");
                    String codigoModificar = scanner.next();
                    System.out.print("Ingrese la nueva descripción del artículo: ");
                    String nuevaDescripcion = scanner.next();
                    System.out.print("Ingrese el nuevo precio de compra del artículo: ");
                    double nuevoPrecioCompra = scanner.nextDouble();
                    System.out.print("Ingrese el nuevo precio de venta del artículo: ");
                    double nuevoPrecioVenta = scanner.nextDouble();
                    almacen.modificarArticulo(codigoModificar, nuevaDescripcion, nuevoPrecioCompra, nuevoPrecioVenta);
                    break;
                case 5:
                    System.out.print("Ingrese el código del artículo: ");
                    String codigoEntrada = scanner.next();
                    System.out.print("Ingrese la cantidad de mercancía a ingresar: ");
                    int cantidadEntrada = scanner.nextInt();
                    almacen.entradaMercancia(codigoEntrada, cantidadEntrada);
                    break;
                case 6:
                    System.out.print("Ingrese el código del artículo: ");
                    String codigoSalida = scanner.next();
                    System.out.print("Ingrese la cantidad de mercancía a sacar: ");
                    int cantidadSalida = scanner.nextInt();
                    almacen.salidaMercancia(codigoSalida, cantidadSalida);
                    break;
                case 7:
                    System.out.println("Saliendo del programa, muchas gracias poe usar GESTESIMAL :)");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}

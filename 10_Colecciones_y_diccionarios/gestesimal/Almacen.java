

/**
 * Almacen
 */
import java.util.ArrayList;

class Almacen {
    
    ArrayList<Articulo> articulos;

    Almacen() {
        this.articulos = new ArrayList<>();
    }

    void listarArticulos() {

        System.out.println("Listado de Artículos:");
        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }
    }

    Articulo buscarArticulo(String codigo) {

        for (Articulo articulo : articulos) {
            if (articulo.codigo.equals(codigo)) {
                return articulo;
            }
        }
        return null;
    }

    void agregarArticulo(Articulo articulo) {

        if (buscarArticulo(articulo.codigo) == null) {
            articulos.add(articulo);
            System.out.println("Artículo agregado correctamente");
        } else {
            System.out.println("El artículo ya existe en el almacén");
        }
    }

    void eliminarArticulo(String codigo) {

        Articulo articulo = buscarArticulo(codigo);

        if (articulo != null) {
            articulos.remove(articulo);
            System.out.println("Artículo eliminado correctamente");
        } else {
            System.out.println("El artículo no existe en el almacén");
        }
    }

    void modificarArticulo(String codigo, String nuevaDescripcion, double nuevoPrecioCompra, double nuevoPrecioVenta) {

        Articulo articulo = buscarArticulo(codigo);

        if (articulo != null) {
            articulo.descripcion = nuevaDescripcion;
            articulo.precioCompra = nuevoPrecioCompra;
            articulo.precioVenta = nuevoPrecioVenta;

            System.out.println("Artículo modificado correctamente");
        } else {
            System.out.println("El artículo no existe en el almacén");
        }
    }

    void entradaMercancia(String codigo, int cantidad) {

        Articulo articulo = buscarArticulo(codigo);

        if (articulo != null) {
            articulo.stock += cantidad;
            System.out.println("Entrada de mercancía registrada correctamente");
        } else {
            System.out.println("El artículo no existe en el almacén");
        }
    }

    void salidaMercancia(String codigo, int cantidad) {
        Articulo articulo = buscarArticulo(codigo);
        if (articulo != null) {
            if (articulo.stock >= cantidad) {
                articulo.stock -= cantidad;
                System.out.println("Salida de mercancía registrada correctamente");
            } else {
                System.out.println("No hay suficiente stock para realizar la salida de mercancía");
            }
        } else {
            System.out.println("El artículo no existe en el almacén");
        }
    }
}
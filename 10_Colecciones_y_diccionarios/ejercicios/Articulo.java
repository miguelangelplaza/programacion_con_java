package ejercicios;

/**
 * Articulo
 */


class Articulo {

     String codigo;
     String descripcion;
     double precioCompra;
     double precioVenta;
     int stock;

    Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion + ", Precio compra: " + precioCompra + ", Precio venta: " + precioVenta + ", Stock: " + stock;
    }
}
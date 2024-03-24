package ejercicio05;

public class Articulo {
    
    private String codigo;
    private String descripcion; 
    private double precioCompra;
    private double precioVenta;
    private int stock;

    

    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public Articulo(){
        
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "------" + 
                "\nCodigo: " + this.codigo +
                "\nDescripcion: " + this.descripcion +
                "\nPrecio de compra: " + this.precioCompra +
                "\nPrecio de venta: " + this.precioVenta +
                "\nstock: " + this.stock;
    }

    
    
    
}

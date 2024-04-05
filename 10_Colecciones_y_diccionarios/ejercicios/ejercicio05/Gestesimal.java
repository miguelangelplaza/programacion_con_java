package ejercicio05;

public class Gestesimal {
    static final int N = 10;
    static Articulo[] almacen = new Articulo [N];
    
    public static int primeraLibre() {
        for (int i = 0; i < N; i++) {
            if (almacen[i].getCodigo() == null) {
                return i; 
            }
        }
        return -1;
    }
    public static boolean codigoExiste(String codigo){
        for (Articulo articulo : almacen) {
            if (articulo.getCodigo().equals(codigo)) {
                return true;
            }
        }
    return false;
    }

    public static int posicionArticulo (String codigo){
        for (int i = 0; i < N; i++) {
            if (almacen[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            Gestesimal.almacen[i] = new Articulo();
        }
        int menu; 
        String codigoIntroducido; 
        String descripcionIntroducida;
        double precioDeCompraIntroducido;
        double precioDeVentaIntroducido; 
        int stockIntroducido;  

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");

            System.out.print("Introduzca una opcion: ");

            menu = Integer.parseInt(System.console().readLine());
            switch (menu) {
                case 1:     //listado
                    for (Articulo articulo : almacen) {
                     if (articulo.getCodigo()!=null ) {
                            System.out.println(articulo);
                        }
                    }
                    break;
                

                case 2:     //ALTA
                    if (primeraLibre() == -1) {
                        System.out.print("Lo sentimos. No queda hueco para registrar articulos");
                    } else {
                        System.out.print("codigo: ");
                        codigoIntroducido = System.console().readLine();
                        System.out.print("Descripcion: ");
                        descripcionIntroducida = System.console().readLine();
                        System.out.print("Precio de compra: ");
                        precioDeCompraIntroducido = Double.parseDouble(System.console().readLine());
                        System.out.print("Precio de venta: ");
                        precioDeVentaIntroducido = Double.parseDouble(System.console().readLine());
                        System.out.print("Stock: ");
                        stockIntroducido = Integer.parseInt(System.console().readLine());

                        almacen[primeraLibre()] = new Articulo(codigoIntroducido, descripcionIntroducida, precioDeCompraIntroducido, precioDeVentaIntroducido, stockIntroducido);
                    }
            
                    break;
                case 3:     //baja
                    System.out.print("Introduzca el codigo del articulo a eliminar: ");
                    codigoIntroducido = System.console().readLine();
                    if (!codigoExiste(codigoIntroducido)) {
                        System.out.println("Lo siento, el codigo intoducido no existe");
                    } else {
                        almacen[posicionArticulo(codigoIntroducido)].setCodigo(null);
                    }
                    break;

                default:
                    break;
            }

        } while (menu !=7 );
    
    }
}

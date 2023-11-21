/**
 * Ejercicio01
 * 
 * @author Miguel Angel Plaza Rueda
 */
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double descuento = 0;

        System.out.println("Introduzca el tipo de producto:");
        System.out.println("1. Alimentación");
        System.out.println("2. Farmacia");
        System.out.println("3. Electrónica");
        System.out.println("4. Moda");

        int opcion = scanner.nextInt();
        scanner.nextLine();    //baja a ala linea de abaajo 

        System.out.println("Ingresa el nombre del producto:");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingresa el numero de unidades:");
        int numUnidades = scanner.nextInt();

        System.out.println("Ingresa el precio por unidad:");
        double precioPorUnidad = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("¿Tienes algún codigo promocional? (SINIVA / NO)(solo para alimentacion)");
                String codigoPromocionalAlimentacion = scanner.next();

                if (codigoPromocionalAlimentacion.equalsIgnoreCase("SINIVA")) {
                    // Aplicar descuento del IVA 4% solo para alimentacion
                    if (nombreProducto.equalsIgnoreCase("Huevos") ||
                            nombreProducto.equalsIgnoreCase("Pan") ||
                            nombreProducto.equalsIgnoreCase("Leche") ||
                            nombreProducto.equalsIgnoreCase("Fruta") ||
                            nombreProducto.equalsIgnoreCase("Verdura") ||
                            nombreProducto.equalsIgnoreCase("Otros")) {
                        double subtotal = numUnidades * precioPorUnidad;
                        double descuentoIVA = subtotal * 0.04;
                        total = subtotal - descuentoIVA;
                        descuento = descuentoIVA;
                    } else {
                        total = numUnidades * precioPorUnidad;
                    }
                } else if (codigoPromocionalAlimentacion.equalsIgnoreCase("NO")) {
                    total = numUnidades * precioPorUnidad;
                } else {
                    System.out.println("Código promocional no válido. Se aplicará el precio estándar.");
                    total = numUnidades * precioPorUnidad;
                }
                

            case 2:
                //4% iva farmacia
                total = numUnidades * precioPorUnidad;
                


            case 3:
                System.out.println("¿Tienes algún código promocional? (PROMO50 / NO)(solo para electronica)");
                String codigoPromocionalElectronica = scanner.next();



                 // 50% solo para electrónica
                if (codigoPromocionalElectronica.equalsIgnoreCase("PROMO50")) {
                    total = (numUnidades * precioPorUnidad) * 0.5;
                    descuento = (numUnidades * precioPorUnidad) * 0.5;
                } else if (codigoPromocionalElectronica.equalsIgnoreCase("NO")) {
                    total = numUnidades * precioPorUnidad;
                } else {
                    System.out.println("Código promocional no válido. Se aplicará el precio estándar.");
                    total = numUnidades * precioPorUnidad;
                }
                
            case 4:
                System.out.println("¿Tienes algún código promocional? (PROMO3X2 / NO) (solo para moda)");
                String codigoPromocionalModa = scanner.next();



                // el descuento del 3x2 solo para moda
                if (codigoPromocionalModa.equalsIgnoreCase("PROMO3X2")) {
                    int unidadesPagadas = (numUnidades / 3) * 2 + (numUnidades % 3);
                    total = unidadesPagadas * precioPorUnidad;
                    descuento = (numUnidades - unidadesPagadas) * precioPorUnidad;
                } else if (codigoPromocionalModa.equalsIgnoreCase("NO")) {
                    total = numUnidades * precioPorUnidad;
                } else {
                    System.out.println("Código promocional no válido. Se aplicará el precio estándar.");
                    total = numUnidades * precioPorUnidad;
                }
                
           
        }

        System.out.println("\n--- Ticket de Compra ---");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + numUnidades);
        System.out.println("Precio por unidad: " + precioPorUnidad);
        System.out.println("Total a pagar: " + total);

        if (descuento > 0) {
            System.out.println("Descuento aplicado: " + descuento);
        }

        scanner.close();
    }
}

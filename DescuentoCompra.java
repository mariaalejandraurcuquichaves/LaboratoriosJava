import java.util.Scanner;

public class DescuentoCompra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Ingrese el valor de la compra: ");
        double valorOriginal = scanner.nextDouble();

        int porcentajeDescuento = 0;

        if (valorOriginal >= 500000) {
            porcentajeDescuento = 15;
        } else if (valorOriginal >= 250000) {
            porcentajeDescuento = 10;
        } else if (valorOriginal >= 100000) {
            porcentajeDescuento = 5;
        } else {
            porcentajeDescuento = 0;
        }

        double valorDescuento = valorOriginal * (porcentajeDescuento / 100.0);
        double totalFinal = valorOriginal - valorDescuento;

        System.out.println("\n--- Resumen de la Compra ---");
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor original: $" + valorOriginal);
        System.out.println("Porcentaje de descuento: " + porcentajeDescuento + "%");
        System.out.println("Valor del descuento: $" + valorDescuento);
        System.out.println("Total a pagar: $" + totalFinal);

        scanner.close();
    }
}
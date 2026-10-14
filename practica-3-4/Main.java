import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Titular: ");
        String nombre = scanner.nextLine();

        CuentaPuntos cuenta = new CuentaPuntos(nombre);

        System.out.println("\n--- Puntos Iniciales: " + cuenta.getPuntos() + " ---");

        System.out.print("Ingrese primera cantidad de puntos: ");
        int cantidad1 = scanner.nextInt();
        if (cuenta.sumarPuntos(cantidad1)) {
            System.out.println("-> Primera operación registrada.");
        } else {
            System.out.println("-> Rechazado: La cantidad debe ser positiva.");
        }

        System.out.print("Ingrese segunda cantidad de puntos: ");
        int cantidad2 = scanner.nextInt();
        if (cuenta.sumarPuntos(cantidad2)) {
            System.out.println("-> Segunda operación registrada.");
        } else {
            System.out.println("-> Rechazado: La cantidad debe ser positiva.");
        }

        // 4. Mostrar puntos finales
        System.out.println("\n--- RESUMEN FINAL ---");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Puntos finales: " + cuenta.getPuntos());

        scanner.close();
    }
}
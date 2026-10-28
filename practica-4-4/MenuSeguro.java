import java.util.Scanner;

public class MenuSeguro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n=== MENÚ SEGURO ===");
            System.out.println("1. Consultar");
            System.out.println("2. Registrar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            String entrada = scanner.nextLine();

            try {
                opcion = Integer.parseInt(entrada);

                switch (opcion) {
                    case 1 -> System.out.println("-> Opción elegida: Consultar");
                    case 2 -> System.out.println("-> Opción elegida: Registrar");
                    case 0 -> System.out.println("-> Saliendo del programa...");
                    default -> System.out.println(" Error: La opción " + opcion + " no existe.");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Error: Debe ingresar un valor numérico entero.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
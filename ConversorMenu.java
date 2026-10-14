import java.util.Scanner;

public class ConversorMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CONVERSOR ===");
        System.out.println("1. Kilómetros a metros");
        System.out.println("2. Metros a centímetros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese el valor en kilómetros: ");
                double km = scanner.nextDouble();
                System.out.println(km + " km equivalen a " + (km * 1000) + " metros.");
            }
            case 2 -> {
                System.out.print("Ingrese el valor en metros: ");
                double metros = scanner.nextDouble();
                System.out.println(metros + " m equivalen a " + (metros * 100) + " centímetros.");
            }
            case 3 -> {
                System.out.print("Ingrese el valor en grados Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F.");
            }
            case 0 -> System.out.println("Saliendo del conversor...");
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
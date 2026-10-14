import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("\n--- OPERACIONES ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + (num1 + num2));
            case 2 -> System.out.println("Resultado: " + (num1 - num2));
            case 3 -> System.out.println("Resultado: " + (num1 * num2));
            case 4 -> {
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
            }
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}

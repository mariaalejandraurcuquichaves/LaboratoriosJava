import java.util.Scanner;

public class CalculadoraSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n==================================");
            System.out.println("       CALCULADORA SEGURA");
            System.out.println("==================================");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            String entradaOpcion = scanner.nextLine();

            try {
                opcion = Integer.parseInt(entradaOpcion);

                if (opcion >= 1 && opcion <= 4) {
                    double num1 = pedirNumero(scanner, "Ingrese el primer número: ");
                    double num2 = pedirNumero(scanner, "Ingrese el segundo número: ");

                    switch (opcion) {
                        case 1 -> System.out.println("-> Resultado Suma: " + (num1 + num2));
                        case 2 -> System.out.println("-> Resultado Resta: " + (num1 - num2));
                        case 3 -> System.out.println("-> Resultado Multiplicación: " + (num1 * num2));
                        case 4 -> {
                            if (num2 == 0) {
                                System.out.println(" Error de operación: No se permite la división entre cero.");
                            } else {
                                System.out.println("-> Resultado División: " + (num1 / num2));
                            }
                        }
                    }
                } else if (opcion == 0) {
                    System.out.println("Gracias por usar la Calculadora Segura.");
                } else {
                    System.out.println(" Error: La opción elegida no existe en el menú.");
                }

            } catch (NumberFormatException e) {
                System.out.println(" Error: Debe escribir un número entero para seleccionar la opción del menú.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static double pedirNumero(Scanner scanner, String mensaje) {
        double numero = 0;
        boolean valido = false;

        do {
            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                numero = Double.parseDouble(entrada);
                if (Double.isFinite(numero)) {
                    valido = true;
                } else {
                    System.out.println(" Error: Debe ingresar un número finito (no NaN ni Infinity).");
                }
            } catch (NumberFormatException e) {
                System.out.println(" Error: Entrada no numérica. Intente nuevamente.");
            }
        } while (!valido);

        return numero;
    }
}
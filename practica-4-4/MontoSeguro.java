import java.util.Scanner;

public class MontoSeguro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monto = 0;
        boolean valido = false;

        do {
            System.out.print("Ingrese un monto positivo: ");
            String entrada = scanner.nextLine();

            try {
                monto = Double.parseDouble(entrada);

                if (!Double.isFinite(monto) || monto <= 0) {
                    System.out.println(" Error: Debes escribir un monto positivo y finito (no 0, ni negativo, ni NaN, ni Infinity).");
                } else {
                    valido = true;
                    System.out.println(" Monto aceptado: $" + monto);
                }
            } catch (NumberFormatException e) {
                System.out.println(" Error: Debes ingresar una representación numérica decimal válida (ej. 30000.50).");
            }

        } while (!valido);

        scanner.close();
    }
}
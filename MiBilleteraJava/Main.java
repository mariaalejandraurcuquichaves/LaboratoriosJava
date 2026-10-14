import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   BIENVENIDO A BILLETERA 2.0");
        System.out.println("================================");
        System.out.print("Nombre del titular: ");
        String titular = scanner.nextLine().trim();

        while (titular.isEmpty()) {
            System.out.print("El nombre es obligatorio. Intenta nuevamente: ");
            titular = scanner.nextLine().trim();
        }

        Billetera billetera = new Billetera(titular);
        int opcion = -1;

        do {
            mostrarMenu(billetera);
            System.out.print("Seleccione una opción: ");
            String entradaOpcion = scanner.nextLine().trim();

            try {
                opcion = Integer.parseInt(entradaOpcion);

                switch (opcion) {
                    case 1 -> registrarIngresoUI(scanner, billetera);
                    case 2 -> registrarGastoUI(scanner, billetera);
                    case 3 -> {
                        System.out.println("\n--------------------------------");
                        System.out.println("Saldo actual disponible: $" + billetera.getSaldo());
                        System.out.println("--------------------------------");
                    }
                    case 4 -> mostrarHistorialUI(billetera.getMovimientos(), "HISTORIAL COMPLETO");
                    case 5 -> filtrarPorTipoUI(scanner, billetera);
                    case 6 -> mostrarCategoriasUI(billetera);
                    case 7 -> mostrarResumenFinancieroUI(billetera);
                    case 0 -> System.out.println("\nPrograma finalizado. ¡Hasta pronto!");
                    default -> System.out.println("\n Error: La opción elegida no existe.");
                }

            } catch (NumberFormatException e) {
                System.out.println("\n Error: Debes ingresar una opción numérica entera.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu(Billetera billetera) {
        System.out.println();
        System.out.println("================================");
        System.out.println("       MI BILLETERA JAVA");
        System.out.println("================================");
        System.out.println("Titular: " + billetera.getTitular());
        System.out.println("Saldo disponible: $" + billetera.getSaldo());
        System.out.println();
        System.out.println("1. Registrar ingreso");
        System.out.println("2. Registrar gasto");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Mostrar movimientos");
        System.out.println("5. Consultar movimientos por tipo");
        System.out.println("6. Consultar categorías utilizadas");
        System.out.println("7. Resumen financiero");
        System.out.println("0. Salir");
    }

    private static void registrarIngresoUI(Scanner scanner, Billetera billetera) {
        System.out.print("\nCategoría del ingreso: ");
        String categoria = scanner.nextLine().trim();

        System.out.print("Valor del ingreso: ");
        String entradaValor = scanner.nextLine().trim();

        try {
            double valor = Double.parseDouble(entradaValor);
            if (billetera.registrarIngreso(valor, categoria)) {
                System.out.println(" Ingreso registrado con éxito.");
            } else {
                System.out.println(" Error: El monto debe ser positivo/finito y la categoría no puede estar vacía.");
            }
        } catch (NumberFormatException e) {
            System.out.println(" Error: Debes escribir un monto numérico válido.");
        }
    }

    private static void registrarGastoUI(Scanner scanner, Billetera billetera) {
        System.out.print("\nCategoría del gasto: ");
        String categoria = scanner.nextLine().trim();

        System.out.print("Valor del gasto: ");
        String entradaValor = scanner.nextLine().trim();

        try {
            double valor = Double.parseDouble(entradaValor);
            if (!Double.isFinite(valor) || valor <= 0) {
                System.out.println(" Error: El monto debe ser un número positivo y finito.");
            } else if (valor > billetera.getSaldo()) {
                System.out.println(" Error: Saldo insuficiente para realizar el gasto.");
            } else if (billetera.registrarGasto(valor, categoria)) {
                System.out.println(" Gasto registrado con éxito.");
            } else {
                System.out.println(" Error: No se pudo registrar el gasto.");
            }
        } catch (NumberFormatException e) {
            System.out.println(" Error: Debes escribir un monto numérico válido.");
        }
    }

    private static void mostrarHistorialUI(List<Movimiento> movimientos, String titulo) {
        System.out.println("\n================================");
        System.out.println("           " + titulo);
        System.out.println("================================");

        if (movimientos.isEmpty()) {
            System.out.println("No hay movimientos registrados.");
            return;
        }

        for (int i = 0; i < movimientos.size(); i++) {
            Movimiento m = movimientos.get(i);
            System.out.println((i + 1) + ". " + m.getTipo() + " | " + m.getCategoria() + " | $" + m.getValor());
        }
    }

    private static void filtrarPorTipoUI(Scanner scanner, Billetera billetera) {
        System.out.print("\nIngrese el tipo a filtrar (INGRESO / GASTO): ");
        String tipo = scanner.nextLine().trim();

        if (!tipo.equalsIgnoreCase("INGRESO") && !tipo.equalsIgnoreCase("GASTO")) {
            System.out.println(" Error: Tipo no reconocido. Debe ingresar INGRESO o GASTO.");
            return;
        }

        List<Movimiento> filtrados = billetera.buscarPorTipo(tipo);
        mostrarHistorialUI(filtrados, "MOVIMIENTOS: " + tipo.toUpperCase());
    }

    private static void mostrarCategoriasUI(Billetera billetera) {
        Set<String> categorias = billetera.getCategoriasUtilizadas();
        System.out.println("\n================================");
        System.out.println("     CATEGORÍAS UTILIZADAS");
        System.out.println("================================");

        if (categorias.isEmpty()) {
            System.out.println("No se han registrado categorías aún.");
            return;
        }

        for (String c : categorias) {
            System.out.println("- " + c);
        }
    }

    private static void mostrarResumenFinancieroUI(Billetera billetera) {
        System.out.println("\n================================");
        System.out.println("       RESUMEN FINANCIERO");
        System.out.println("================================");
        System.out.println("Titular: " + billetera.getTitular());
        System.out.println("Saldo: $" + billetera.getSaldo());
        System.out.println("Ingresos realizados: " + billetera.getCantidadIngresos());
        System.out.println("Total ingresado: $" + billetera.getTotalIngresos());
        System.out.println("Gastos realizados: " + billetera.getCantidadGastos());
        System.out.println("Total gastado: $" + billetera.getTotalGastos());

        System.out.println("\nGastos por categoría:");
        Map<String, Double> gastosMap = billetera.gastosPorCategoria();

        if (gastosMap.isEmpty()) {
            System.out.println(" (Sin gastos registrados)");
        } else {
            for (Map.Entry<String, Double> entry : gastosMap.entrySet()) {
                System.out.println(" " + entry.getKey() + ": $" + entry.getValue());
            }
        }
    }
}
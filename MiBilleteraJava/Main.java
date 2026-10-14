import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("   BIENVENIDO A MI BILLETERA");
        System.out.println("================================");
        System.out.print("Nombre del titular: ");
        String titular = scanner.nextLine().trim();

        while (titular.isEmpty()) {
            System.out.print("El nombre es obligatorio. Intenta nuevamente: ");
            titular = scanner.nextLine().trim();
        }

        Billetera billetera = new Billetera(titular);
        int opcion;

        do {
            mostrarMenu(billetera);
            System.out.print("Seleccione una opción: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("\n Error: Por favor ingrese un número válido.");
                scanner.next(); 
                opcion = -1;
                continue;
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("\nIngrese el monto a registrar: $");
                    double monto = scanner.nextDouble();
                    if (billetera.registrarIngreso(monto)) {
                        System.out.println(" Ingreso de $" + monto + " registrado con éxito.");
                    } else {
                        System.out.println(" Error: El monto ingresado debe ser mayor a $0.");
                    }
                }
                case 2 -> {
                    System.out.print("\nIngrese el monto del gasto: $");
                    double monto = scanner.nextDouble();
                    
                    if (monto <= 0) {
                        System.out.println(" Error: El monto del gasto debe ser mayor a $0.");
                    } else if (monto > billetera.getSaldo()) {
                        System.out.println(" Error: Saldo insuficiente. Saldo disponible: $" + billetera.getSaldo());
                    } else {
                        billetera.registrarGasto(monto);
                        System.out.println(" Gasto de $" + monto + " registrado con éxito.");
                    }
                }
                case 3 -> {
                    System.out.println("\n--------------------------------");
                    System.out.println("Saldo actual disponible: $" + billetera.getSaldo());
                    System.out.println("--------------------------------");
                }
                case 4 -> mostrarResumen(billetera);
                case 0 -> System.out.println("\nGracias por usar Mi Billetera Java. ¡Hasta pronto!");
                default -> System.out.println("\n Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    static void mostrarMenu(Billetera billetera) {
        System.out.println();
        System.out.println("================================");
        System.out.println("        MI BILLETERA JAVA");
        System.out.println("================================");
        System.out.println("Titular: " + billetera.getTitular());
        System.out.println("Saldo disponible: $" + billetera.getSaldo());
        System.out.println();
        System.out.println("1. Registrar ingreso");
        System.out.println("2. Registrar gasto");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Mostrar resumen");
        System.out.println("0. Salir");
    }

    static void mostrarResumen(Billetera billetera) {
        System.out.println();
        System.out.println("================================");
        System.out.println("        RESUMEN DE BILLETERA");
        System.out.println("================================");
        System.out.println("Titular: " + billetera.getTitular());
        System.out.println("Saldo actual: $" + billetera.getSaldo());
        System.out.println("Ingresos realizados: " + billetera.getCantidadIngresos());
        System.out.println("Total ingresado: $" + billetera.getTotalIngresos());
        System.out.println("Gastos realizados: " + billetera.getCantidadGastos());
        System.out.println("Total gastado: $" + billetera.getTotalGastos());
        System.out.println("Balance verificado: $" + billetera.getBalanceOperaciones());
        System.out.println("================================");
    }
}
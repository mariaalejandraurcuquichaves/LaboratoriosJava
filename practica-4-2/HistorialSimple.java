import java.util.ArrayList;
import java.util.List;

public class HistorialSimple {

    public static void main(String[] args) {
        List<Movimiento> movimientos = new ArrayList<>();

        movimientos.add(new Movimiento("INGRESO", "Salario", 1500000));
        movimientos.add(new Movimiento("GASTO", "Transporte", 30000));
        movimientos.add(new Movimiento("GASTO", "Alimentación", 45000));

        System.out.println("=== MOVIMIENTOS REGISTRADOS ===");
        for (Movimiento movimiento : movimientos) {
            System.out.println(
                movimiento.getTipo() + " | "
                + movimiento.getCategoria() + " | $"
                + movimiento.getValor()
            );
        }

        System.out.println("Cantidad de movimientos: " + movimientos.size());

        double totalGastos = 0;
        for (Movimiento m : movimientos) {
            if (m.getTipo().equals("GASTO")) {
                totalGastos += m.getValor();
            }
        }
        System.out.println("Total de gastos: $" + totalGastos);

        System.out.println("\n=== DEMOSTRACIÓN DE COPIA PROTEGIDA ===");
        List<Movimiento> copiaMovimientos = new ArrayList<>(movimientos);

        // Eliminar el primer elemento solo de la copia
        copiaMovimientos.remove(0);

        System.out.println("Cantidad en lista original: " + movimientos.size());
        System.out.println("Cantidad en copia modificada: " + copiaMovimientos.size());
    }
}
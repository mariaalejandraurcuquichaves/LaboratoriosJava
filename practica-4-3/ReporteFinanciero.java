import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReporteFinanciero {

    public static void main(String[] args) {
        List<Movimiento> historial = new ArrayList<>();

        // 6 movimientos (2 ingresos y 4 gastos con categorías repetidas)
        historial.add(new Movimiento("INGRESO", "Salario", 2000000));
        historial.add(new Movimiento("GASTO", "Alimentación", 150000));
        historial.add(new Movimiento("GASTO", "Transporte", 50000));
        historial.add(new Movimiento("INGRESO", "Venta", 300000));
        historial.add(new Movimiento("GASTO", "Alimentación", 80000));
        historial.add(new Movimiento("GASTO", "Entretenimiento", 60000));

        Set<String> todasLasCategorias = new HashSet<>();
        Set<String> categoriasGastos = new HashSet<>();
        Map<String, Double> acumuladoGastos = new HashMap<>();

        for (Movimiento m : historial) {
            todasLasCategorias.add(m.getCategoria());

            if (m.getTipo().equalsIgnoreCase("GASTO")) {
                categoriasGastos.add(m.getCategoria());
                double anterior = acumuladoGastos.getOrDefault(m.getCategoria(), 0.0);
                acumuladoGastos.put(m.getCategoria(), anterior + m.getValor());
            }
        }

        System.out.println("=== REPORTE FINANCIERO INTEGRAL ===");

        System.out.println("\n1. Todas las categorías utilizadas (sin repetir):");
        for (String c : todasLasCategorias) {
            System.out.println("   - " + c);
        }

        System.out.println("\n2. Categorías de gastos (sin repetir):");
        for (String cg : categoriasGastos) {
            System.out.println("   - " + cg);
        }

        System.out.println("\n3. Importe total de gastos por categoría:");
        for (Map.Entry<String, Double> entry : acumuladoGastos.entrySet()) {
            System.out.println("   " + entry.getKey() + ": $" + entry.getValue());
        }

        System.out.println("\n4. Cantidad de categorías de gastos distintas: " + categoriasGastos.size());
    }
}
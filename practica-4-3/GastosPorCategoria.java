import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GastosPorCategoria {

    public static void main(String[] args) {
        List<Movimiento> movimientos = new ArrayList<>();

        movimientos.add(new Movimiento("GASTO", "Transporte", 30000));
        movimientos.add(new Movimiento("GASTO", "Alimentación", 45000));
        movimientos.add(new Movimiento("GASTO", "Transporte", 20000));
        movimientos.add(new Movimiento("INGRESO", "Salario", 1500000));
        movimientos.add(new Movimiento("GASTO", "Salud", 40000));

        Map<String, Double> gastosPorCategoria = new HashMap<>();

        for (Movimiento m : movimientos) {
            if (m.getTipo().equalsIgnoreCase("GASTO")) {
                String cat = m.getCategoria();
                double acumuladoActual = gastosPorCategoria.getOrDefault(cat, 0.0);
                gastosPorCategoria.put(cat, acumuladoActual + m.getValor());
            }
        }

        System.out.println("=== REPORTES DE GASTOS POR CATEGORÍA ===");
        for (Map.Entry<String, Double> entrada : gastosPorCategoria.entrySet()) {
            System.out.println(entrada.getKey() + ": $" + entrada.getValue());
        }
    }
}
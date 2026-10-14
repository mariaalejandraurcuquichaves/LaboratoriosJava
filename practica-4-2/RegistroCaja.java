import java.util.ArrayList;
import java.util.List;

public class RegistroCaja {

    public static void main(String[] args) {
        List<Movimiento> caja = new ArrayList<>();

        caja.add(new Movimiento("INGRESO", "Venta del día", 250000));
        caja.add(new Movimiento("GASTO", "Pago de servicios", 80000));
        caja.add(new Movimiento("INGRESO", "Cobro de factura", 120000));
        caja.add(new Movimiento("GASTO", "Insumos de oficina", 45000));

        double totalIngresos = 0;
        double totalGastos = 0;

        System.out.println("=== REGISTRO DE CAJA ===");
        for (int i = 0; i < caja.size(); i++) {
            Movimiento m = caja.get(i);
            System.out.println((i + 1) + ". [" + m.getTipo() + "] " 
                    + m.getCategoria() + " -> $" + m.getValor());

            if (m.getTipo().equalsIgnoreCase("INGRESO")) {
                totalIngresos += m.getValor();
            } else if (m.getTipo().equalsIgnoreCase("GASTO")) {
                totalGastos += m.getValor();
            }
        }

        System.out.println("---------------------------------");
        System.out.println("Cantidad total de movimientos: " + caja.size());
        System.out.println("Total Ingresos: $" + totalIngresos);
        System.out.println("Total Gastos: $" + totalGastos);
        System.out.println("Balance Neto: $" + (totalIngresos - totalGastos));
    }
}
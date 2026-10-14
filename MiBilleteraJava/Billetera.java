import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Billetera {

    private String titular;
    private double saldo;
    private int cantidadIngresos;
    private double totalIngresos;
    private int cantidadGastos;
    private double totalGastos;
    private List<Movimiento> movimientos;

    public Billetera(String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("El titular es obligatorio.");
        }
        this.titular = titular.trim();
        this.saldo = 0.0;
        this.cantidadIngresos = 0;
        this.totalIngresos = 0.0;
        this.cantidadGastos = 0;
        this.totalGastos = 0.0;
        this.movimientos = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCantidadIngresos() {
        return cantidadIngresos;
    }

    public double getTotalIngresos() {
        return totalIngresos;
    }

    public int getCantidadGastos() {
        return cantidadGastos;
    }

    public double getTotalGastos() {
        return totalGastos;
    }

    public boolean registrarIngreso(double valor, String categoria) {
        if (!Double.isFinite(valor) || valor <= 0) {
            return false;
        }
        if (categoria == null || categoria.isBlank()) {
            return false;
        }

        this.saldo += valor;
        this.cantidadIngresos++;
        this.totalIngresos += valor;
        this.movimientos.add(new Movimiento("INGRESO", categoria, valor));
        return true;
    }

    public boolean registrarGasto(double valor, String categoria) {
        if (!Double.isFinite(valor) || valor <= 0) {
            return false;
        }
        if (categoria == null || categoria.isBlank()) {
            return false;
        }
        if (valor > this.saldo) {
            return false; 
        }

        this.saldo -= valor;
        this.cantidadGastos++;
        this.totalGastos += valor;
        this.movimientos.add(new Movimiento("GASTO", categoria, valor));
        return true;
    }

    public List<Movimiento> getMovimientos() {
        return new ArrayList<>(movimientos);
    }

    public List<Movimiento> buscarPorTipo(String tipo) {
        List<Movimiento> encontrados = new ArrayList<>();
        if (tipo == null) return encontrados;

        for (Movimiento m : movimientos) {
            if (m.getTipo().equalsIgnoreCase(tipo.trim())) {
                encontrados.add(m);
            }
        }
        return encontrados;
    }

    public Set<String> getCategoriasUtilizadas() {
        Set<String> categorias = new HashSet<>();
        for (Movimiento m : movimientos) {
            categorias.add(m.getCategoria());
        }
        return categorias;
    }

    public Map<String, Double> gastosPorCategoria() {
        Map<String, Double> reporteGastos = new HashMap<>();
        for (Movimiento m : movimientos) {
            if (m.getTipo().equalsIgnoreCase("GASTO")) {
                String cat = m.getCategoria();
                double anterior = reporteGastos.getOrDefault(cat, 0.0);
                reporteGastos.put(cat, anterior + m.getValor());
            }
        }
        return reporteGastos;
    }
}
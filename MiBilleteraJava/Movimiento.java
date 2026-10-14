public class Movimiento {

    private final String tipo;
    private final String categoria;
    private final double valor;

    public Movimiento(String tipo, String categoria, double valor) {
        if (tipo == null || (!tipo.equalsIgnoreCase("INGRESO") && !tipo.equalsIgnoreCase("GASTO"))) {
            throw new IllegalArgumentException("El tipo debe ser INGRESO o GASTO.");
        }

        if (categoria == null || categoria.isBlank()) {
            throw new IllegalArgumentException("La categoría no puede estar vacía.");
        }

        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("El valor debe ser un número positivo y finito.");
        }

        this.tipo = tipo.toUpperCase();
        this.categoria = categoria.trim();
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        return valor;
    }
}
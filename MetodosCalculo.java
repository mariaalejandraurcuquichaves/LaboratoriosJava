public class MetodosCalculo {

    public static void main(String[] args) {
        double total = calcularTotal(85000, 3);

        System.out.println("Total: $" + total);
    }

    static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }
}
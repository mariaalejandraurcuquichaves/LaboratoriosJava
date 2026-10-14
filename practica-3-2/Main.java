public class Main {

    public static void main(String[] args) {
        Producto primero = new Producto("Teclado", 85000, 3);
        Producto segundo = new Producto("Mouse", 45000, 7);

        primero.mostrarDetalle();
        System.out.println("Subtotal: $" + primero.calcularSubtotal());
        System.out.println("-----------------------------");

        segundo.mostrarDetalle();
        System.out.println("Subtotal: $" + segundo.calcularSubtotal());
    }
}
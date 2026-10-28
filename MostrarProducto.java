public class MostrarProducto {

    public static void main(String[] args) {
        mostrarProducto("Teclado Mecánico", 120000.0);
        mostrarProducto("Mouse Gamer", 65000.0);
        mostrarProducto("Monitor 24''", 450000.0);
    }

    static void mostrarProducto(String nombre, double precio) {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}
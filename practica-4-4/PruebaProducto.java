public class PruebaProducto {

    public static void main(String[] args) {
        try {
            ProductoValidado producto = new ProductoValidado("Teclado", -500);
            System.out.println(producto.getNombre());
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo crear: " + e.getMessage());
        }
    }
}
public class Main {

    public static void main(String[] args) {
        // Producto 1
        Producto producto1 = new Producto();
        producto1.nombre = "Teclado";
        producto1.precio = 85000;
        producto1.cantidad = 3;

        // Producto 2
        Producto producto2 = new Producto();
        producto2.nombre = "Mouse";
        producto2.precio = 45000;
        producto2.cantidad = 7;

        // Producto 3
        Producto producto3 = new Producto();
        producto3.nombre = "Monitor";
        producto3.precio = 550000;
        producto3.cantidad = 2;

        // Mostrar fichas
        System.out.println("=== CATÁLOGO DE PRODUCTOS ===");
        producto1.mostrarDetalle();
        System.out.println("Subtotal: $" + producto1.calcularSubtotal());
        System.out.println("-----------------------------");

        producto2.mostrarDetalle();
        System.out.println("Subtotal: $" + producto2.calcularSubtotal());
        System.out.println("-----------------------------");

        producto3.mostrarDetalle();
        System.out.println("Subtotal: $" + producto3.calcularSubtotal());
        System.out.println("-----------------------------");

        // Cálculo del gran total
        double totalGeneral = producto1.calcularSubtotal() + 
                             producto2.calcularSubtotal() + 
                             producto3.calcularSubtotal();

        System.out.println("VALOR TOTAL DEL CATÁLOGO: $" + totalGeneral);
    }
}
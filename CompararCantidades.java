public class CompararCantidades {

    public static void main(String[] args) {
        int inventario = 12;
        int cantidadSolicitada = 8;

        boolean hayInventarioSuficiente = inventario >= cantidadSolicitada;
        boolean esIgualAlInventario = cantidadSolicitada == inventario;
        boolean superaInventario = cantidadSolicitada > inventario;

        System.out.println("¿Hay inventario suficiente?: " + hayInventarioSuficiente);
        System.out.println("¿La cantidad solicitada es exactamente igual al inventario?: " + esIgualAlInventario);
        System.out.println("¿La cantidad solicitada supera el inventario?: " + superaInventario);
    }
}
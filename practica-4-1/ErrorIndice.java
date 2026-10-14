public class ErrorIndice {

    public static void main(String[] args) {
        int[] valores = {10, 20, 30};

        // Corrección: El último índice válido es 2
        System.out.println("Último valor: " + valores[2]);

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Posición " + i + " -> " + valores[i]);
        }
    }
}
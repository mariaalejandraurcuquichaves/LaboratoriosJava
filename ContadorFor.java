public class ContadorFor {

    public static void main(String[] args) {
        System.out.println("--- Conteo ascendente ---");
        for (int numero = 1; numero <= 5; numero++) {
            System.out.println(numero);
        }

        System.out.println("--- Conteo descendente ---");
        for (int numero = 10; numero >= 1; numero--) {
            System.out.println(numero);
        }
    }
}
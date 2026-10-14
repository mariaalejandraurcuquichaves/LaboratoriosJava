import java.util.Scanner;

public class ContadorWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número (0 para salir): ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            System.out.println("Ingresaste: " + numero);
            System.out.print("Ingresa otro número (0 para salir): ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa terminado.");
        scanner.close();
    }
}
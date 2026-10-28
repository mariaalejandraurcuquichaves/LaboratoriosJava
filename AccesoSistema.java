import java.util.Scanner;

public class AccesoSistema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String claveCorrecta = "java21";

        System.out.print("Ingrese su nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String claveIngresada = scanner.nextLine();

        if (usuarioIngresado.equals(usuarioCorrecto) && claveIngresada.equals(claveCorrecta)) {
            System.out.println("Acceso concedido al sistema.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }

        scanner.close();
    }
}
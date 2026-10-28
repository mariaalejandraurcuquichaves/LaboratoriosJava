public class ValidacionUsuario {

    public static void main(String[] args) {
        String usuarioRegistrado = "aprendiz";
        String usuarioIngresado = "Aprendiz";

        boolean coincideExacto = usuarioRegistrado.equals(usuarioIngresado);
        boolean coincideSinMayusculas = usuarioRegistrado.equalsIgnoreCase(usuarioIngresado);

        System.out.println("Resultado usando .equals(): " + coincideExacto);
        System.out.println("Resultado usando .equalsIgnoreCase(): " + coincideSinMayusculas);
    }
}
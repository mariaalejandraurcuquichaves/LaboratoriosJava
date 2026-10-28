import java.util.HashMap;
import java.util.Map;

public class ErrorClave {

    public static void main(String[] args) {
        Map<String, Double> totales = new HashMap<>();

        double salud = totales.getOrDefault("Salud", 0.0);

        System.out.println("Gasto en Salud (seguro): $" + salud);
    }
}
import java.util.HashMap;
import java.util.Map;

public class PrimerMapa {

    public static void main(String[] args) {
        Map<String, Double> gastos = new HashMap<>();

        gastos.put("Transporte", 30000.0);
        gastos.put("Alimentación", 45000.0);

        System.out.println("Gasto en Transporte: $" + gastos.get("Transporte"));
        System.out.println("¿Existe la clave Salud?: " + gastos.containsKey("Salud"));

        gastos.put("Transporte", 50000.0);

        System.out.println("Nuevo gasto en Transporte (reemplazado): $" + gastos.get("Transporte"));
        System.out.println("Cantidad de categorías en el mapa: " + gastos.size());

        System.out.println("\n--- Predicción Punto 5 ---");
        Map<String, Double> valores = new HashMap<>();
        valores.put("Salud", 10000.0);
        valores.put("Salud", 20000.0);
        valores.put("Transporte", 5000.0);

        System.out.println("Valor final en Salud: $" + valores.get("Salud")); // Muestra 20000.0
        System.out.println("Tamaño del mapa valores: " + valores.size());      // Muestra 2
    }
}
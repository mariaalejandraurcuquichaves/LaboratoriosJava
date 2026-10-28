import java.util.HashSet;
import java.util.Set;

public class CategoriasUnicas {

    public static void main(String[] args) {
        Set<String> categorias = new HashSet<>();

        // Intentamos agregar Transporte dos veces
        categorias.add("Transporte");
        categorias.add("Alimentación");
        categorias.add("Transporte");
        categorias.add("Salud");

        System.out.println("Cantidad de categorías únicas: " + categorias.size()); // Muestra 3
        System.out.println("¿Existe Transporte?: " + categorias.contains("Transporte"));

        System.out.println("--- Categorías Registradas ---");
        for (String categoria : categorias) {
            System.out.println("- " + categoria);
        }
    }
}
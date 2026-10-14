import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTareas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tareas = new ArrayList<>();

        System.out.println("=== REGISTRO DE TAREAS ===");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese la tarea " + i + ": ");
            tareas.add(scanner.nextLine());
        }

        System.out.println("\n--- Lista de Tareas ---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        System.out.println("Cantidad total de tareas: " + tareas.size());

        System.out.print("\nIngrese una tarea para buscar: ");
        String tareaBuscar = scanner.nextLine();
        if (tareas.contains(tareaBuscar)) {
            System.out.println("La tarea '" + tareaBuscar + "' SÍ está registrada.");
        } else {
            System.out.println("La tarea '" + tareaBuscar + "' NO existe en la lista.");
        }

        System.out.print("\nIngrese el nombre de la tarea que desea eliminar: ");
        String tareaEliminar = scanner.nextLine();
        if (tareas.remove(tareaEliminar)) {
            System.out.println("Tarea '" + tareaEliminar + "' eliminada con éxito.");
        } else {
            System.out.println("No se pudo eliminar. La tarea no estaba en la lista.");
        }

        System.out.println("\n--- Lista de Tareas Actualizada ---");
        for (String t : tareas) {
            System.out.println("- " + t);
        }

        scanner.close();
    }
}
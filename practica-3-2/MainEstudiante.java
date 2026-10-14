public class MainEstudiante {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Carlos Pérez", "2558900", 3, 2.8);
        Estudiante e2 = new Estudiante("Ana Gómez", "2558900", 3, 4.1);

        e1.mostrarPerfil();
        e2.mostrarPerfil();
    }
}
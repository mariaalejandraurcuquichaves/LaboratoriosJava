public class ArreglosBasicos {

    public static void main(String[] args) {
        // Punto 2: Crear y consultar un arreglo
        String[] productos = {"Teclado", "Mouse", "Monitor"};

        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println("Cantidad: " + productos.length);

        System.out.println("-------------------------");

        // Punto 3: Modificar un elemento
        productos[1] = "Mouse inalámbrico";
        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);

        System.out.println("-------------------------");

        // Punto 4: Crear un arreglo con tamaño definido
        int[] cantidades = new int[4];
        cantidades[0] = 5;
        cantidades[1] = 8;
        cantidades[2] = 2;
        cantidades[3] = 10;
        System.out.println("Posición 2: " + cantidades[2]);
        System.out.println("Tamaño del arreglo cantidades: " + cantidades.length);
    }
}
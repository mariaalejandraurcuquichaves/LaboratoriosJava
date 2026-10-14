public class MainTermometro {

    public static void main(String[] args) {
        Termometro t1 = new Termometro(0.0);
        Termometro t2 = new Termometro(25.0);

        System.out.println(t1.temperaturaCelsius + " °C -> " + t1.convertirAFahrenheit() + " °F");
        System.out.println(t2.temperaturaCelsius + " °C -> " + t2.convertirAFahrenheit() + " °F");
    }
}
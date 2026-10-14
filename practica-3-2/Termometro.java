public class Termometro {

    double temperaturaCelsius;

    public Termometro(double temperaturaInicial) {
        this.temperaturaCelsius = temperaturaInicial;
    }

    void mostrarCelsius() {
        System.out.println("Temperatura: " + temperaturaCelsius + " °C");
    }

    double convertirAFahrenheit() {
        return (temperaturaCelsius * 9.0 / 5.0) + 32.0;
    }
}
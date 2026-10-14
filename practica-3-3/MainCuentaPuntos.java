public class MainCuentaPuntos {

    public static void main(String[] args) {
        CuentaPuntos cuenta = new CuentaPuntos("Diego");

        System.out.println("Puntos iniciales: " + cuenta.consultarPuntos());
        System.out.println("Sumar 80: " + cuenta.sumarPuntos(80));      
        System.out.println("Canjear 30: " + cuenta.canjearPuntos(30));    
        System.out.println("Canjear 100: " + cuenta.canjearPuntos(100));  

        System.out.println("Puntos finales: " + cuenta.consultarPuntos());
    }
}
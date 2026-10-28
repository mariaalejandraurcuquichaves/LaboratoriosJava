public class PruebaBilleteras {

    public static void main(String[] args) {
        Billetera laura = new Billetera("Laura");
        Billetera diego = new Billetera("Diego");
        Billetera carlos = new Billetera("Carlos"); 

        laura.registrarIngreso(100000);
        diego.registrarIngreso(200000);
        laura.registrarGasto(25000);
        
        carlos.registrarIngreso(500000);
        carlos.registrarGasto(120000);

        System.out.println("Laura: $" + laura.getSaldo() + " (Esperado: $75000.0)");
        System.out.println("Diego: $" + diego.getSaldo() + " (Esperado: $200000.0)");
        System.out.println("Carlos: $" + carlos.getSaldo() + " (Esperado: $380000.0)");
    }
}
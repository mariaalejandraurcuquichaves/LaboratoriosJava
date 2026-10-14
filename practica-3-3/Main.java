public class Main {

    public static void main(String[] args) {
        Billetera billetera = new Billetera("Laura");

        // Pruebas de ingreso
        System.out.println("Ingreso 100000: " + billetera.registrarIngreso(100000)); 
        System.out.println("Ingreso -2000: " + billetera.registrarIngreso(-2000));  

        // Pruebas de gasto
        System.out.println("Gasto 30000: " + billetera.registrarGasto(30000));       
        System.out.println("Gasto 90000: " + billetera.registrarGasto(90000));       

        // Resumen
        System.out.println("--------------------------------");
        System.out.println("Titular: " + billetera.getTitular());
        System.out.println("Cantidad de ingresos: " + billetera.getCantidadIngresos());
        System.out.println("Cantidad de gastos: " + billetera.getCantidadGastos());
        System.out.println("Saldo: $" + billetera.getSaldo());
    }
}
public class Billetera {

    
    private String titular;
    private double saldo;
    private int cantidadIngresos;
    private double totalIngresos;
    private int cantidadGastos;
    private double totalGastos;

    public Billetera(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.cantidadIngresos = 0;
        this.totalIngresos = 0.0;
        this.cantidadGastos = 0;
        this.totalGastos = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getCantidadIngresos() {
        return cantidadIngresos;
    }

    public double getTotalIngresos() {
        return totalIngresos;
    }

    public int getCantidadGastos() {
        return cantidadGastos;
    }

    public double getTotalGastos() {
        return totalGastos;
    }

    public double getBalanceOperaciones() {
        return totalIngresos - totalGastos;
    }

    public boolean registrarIngreso(double valor) {
        if (valor <= 0) {
            return false; 
        }

        this.saldo += valor;
        this.cantidadIngresos++;
        this.totalIngresos += valor;
        return true; 
    }

    public boolean registrarGasto(double valor) {
        if (valor <= 0 || valor > this.saldo) {
            return false; 
        }

        this.saldo -= valor;
        this.cantidadGastos++;
        this.totalGastos += valor;
        return true; 
    }
}
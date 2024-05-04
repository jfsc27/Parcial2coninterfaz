package co.edu.uniquindio.poo;

public class CuentaAhorro extends CuentaBancaria{
    private final double tasaInteres;

    public CuentaAhorro(String numeroCuenta, double saldo, boolean estadoCuenta, Titular titular, double tasaInteres) {
        super(numeroCuenta, saldo, estadoCuenta, titular);
        this.tasaInteres = tasaInteres;
    }
    
    public double getTasaInteres() {
        return tasaInteres;
    }

    @Override
    public void retirarDinero(double valor) {
        assert valor > 0;
        assert valor <= saldo;
        saldo = saldo - valor;
        if (saldo == 0){
            estadoCuenta = false;
        }
    }
    
}

package co.edu.uniquindio.poo;

public class CuentaCorriente extends CuentaBancaria{
    private double sobregiro;

    public CuentaCorriente(String numeroCuenta, double saldo, boolean estadoCuenta, Titular titular, double sobregiro) {
        super(numeroCuenta, saldo, estadoCuenta, titular);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }
    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirarDinero(double valor) {
        assert valor > 0;
        assert valor <= saldo + sobregiro;
        saldo -= valor;
        if (saldo < 0) { 
            sobregiro -= saldo;
            saldo = 0; 
        }
    }
}

package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public abstract class CuentaBancaria {
    private final String numeroCuenta;
    protected double saldo;
    protected boolean estadoCuenta;
    private final Titular titular;
    private final Collection<Transaccion> listaTransaccion;

    public CuentaBancaria(String numeroCuenta, double saldo, boolean estadoCuenta, Titular titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estadoCuenta = estadoCuenta;
        this.titular = titular;
        this.listaTransaccion = new LinkedList<>();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }
    public void setEstadoCuenta(boolean estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }
    public Titular getTitular() {
        return titular;
    }
    public Collection<Transaccion> getListaTransaccion() {
        return listaTransaccion;
    }

    public void depositarDinero (double valor){
        assert valor > 0;
        saldo = saldo + valor;
        estadoCuenta = true;
    }

    public abstract void retirarDinero (double valor);

    public double consultarSaldo (){
        if (estadoCuenta == true) {
            return saldo;
        } else {
            System.out.println("La cuenta esta inactiva");
        }
        return saldo;
    }

    public boolean cuentaActivaYExiste (String numeroCuenta) {
        return this.numeroCuenta.equals(numeroCuenta) && estadoCuenta;
    }

    public void transferirDinero (double valor, CuentaBancaria cuentaDestino) {
        if (this.saldo >= valor && this.estadoCuenta){
            this.saldo = saldo - valor;
            cuentaDestino.depositarDinero(valor);
        }
    }
}

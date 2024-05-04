package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase abstracta que representa una cuenta bancaria genérica.
 */
public abstract class CuentaBancaria {
    
    /** El número de cuenta asociado a la cuenta bancaria. */
    private final String numeroCuenta;
    
    /** El saldo de la cuenta bancaria. */
    protected double saldo;
    
    /** El estado de la cuenta bancaria (activo o inactivo). */
    protected boolean estadoCuenta;
    
    /** El titular de la cuenta bancaria. */
    private final Titular titular;
    
    /** Lista de transacciones asociadas a la cuenta bancaria. */
    private final Collection<Transaccion> listaTransaccion;

    /**
     * Constructor de la clase CuentaBancaria.
     * @param numeroCuenta El número de la cuenta bancaria.
     * @param saldo El saldo inicial de la cuenta bancaria.
     * @param estadoCuenta El estado de la cuenta bancaria (activo o inactivo).
     * @param titular El titular de la cuenta bancaria.
     */
    public CuentaBancaria(String numeroCuenta, double saldo, boolean estadoCuenta, Titular titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estadoCuenta = estadoCuenta;
        this.titular = titular;
        this.listaTransaccion = new LinkedList<>();
    }

    /**
     * Obtiene el número de cuenta de la cuenta bancaria.
     * @return El número de cuenta.
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta bancaria.
     * @return El saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta bancaria.
     * @param saldo El saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Verifica si la cuenta bancaria está activa.
     * @return true si la cuenta está activa, false de lo contrario.
     */
    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }

    /**
     * Establece el estado de la cuenta bancaria.
     * @param estadoCuenta El estado de la cuenta (activo o inactivo).
     */
    public void setEstadoCuenta(boolean estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    /**
     * Obtiene el titular de la cuenta bancaria.
     * @return El titular de la cuenta.
     */
    public Titular getTitular() {
        return titular;
    }

    /**
     * Obtiene la lista de transacciones asociadas a la cuenta bancaria.
     * @return La lista de transacciones.
     */
    public Collection<Transaccion> getListaTransaccion() {
        return listaTransaccion;
    }

    /**
     * Realiza un depósito en la cuenta bancaria.
     * @param valor El valor a depositar.
     */
    public void depositarDinero(double valor){
        assert valor > 0;
        saldo = saldo + valor;
        estadoCuenta = true;
    }

    /**
     * Método abstracto para retirar dinero de la cuenta bancaria.
     * @param valor El valor a retirar.
     */
    public abstract void retirarDinero(double valor);

    /**
     * Consulta el saldo de la cuenta bancaria.
     * @return El saldo actual de la cuenta.
     */
    public double consultarSaldo(){
        if (estadoCuenta) {
            return saldo;
        } else {
            System.out.println("La cuenta está inactiva");
            return saldo;
        }
    }

    /**
     * Verifica si una cuenta bancaria está activa y existe.
     * @param numeroCuenta El número de cuenta a verificar.
     * @return true si la cuenta está activa y existe, false de lo contrario.
     */
    public boolean cuentaActivaYExiste(String numeroCuenta) {
        return this.numeroCuenta.equals(numeroCuenta) && estadoCuenta;
    }

    /**
     * Transfiere dinero desde la cuenta bancaria actual a otra cuenta bancaria.
     * @param valor El valor a transferir.
     * @param cuentaDestino La cuenta bancaria de destino.
     */
    public void transferirDinero(double valor, CuentaBancaria cuentaDestino) {
        if (this.saldo >= valor && this.estadoCuenta){
            this.saldo = saldo - valor;
            cuentaDestino.depositarDinero(valor);
        }
    }
}

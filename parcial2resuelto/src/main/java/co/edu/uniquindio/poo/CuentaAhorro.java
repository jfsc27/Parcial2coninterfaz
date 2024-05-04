package co.edu.uniquindio.poo;

/**
 * Representa una cuenta de ahorro que extiende la clase CuentaBancaria e incluye una tasa de interés.
 */
public class CuentaAhorro extends CuentaBancaria {
    
    /** La tasa de interés asociada a la cuenta de ahorro. */
    private final double tasaInteres;

    /**
     * Constructor de la clase CuentaAhorro.
     * @param numeroCuenta El número de la cuenta.
     * @param saldo El saldo inicial de la cuenta.
     * @param estadoCuenta El estado de la cuenta (activo o inactivo).
     * @param titular El titular de la cuenta.
     * @param tasaInteres La tasa de interés de la cuenta de ahorro.
     */
    public CuentaAhorro(String numeroCuenta, double saldo, boolean estadoCuenta, Titular titular, double tasaInteres) {
        super(numeroCuenta, saldo, estadoCuenta, titular);
        this.tasaInteres = tasaInteres;
    }
    
    /**
     * Obtiene la tasa de interés asociada a la cuenta de ahorro.
     * @return La tasa de interés.
     */
    public double getTasaInteres() {
        return tasaInteres;
    }

    /**
     * Retira dinero de la cuenta de ahorro.
     * @param valor El valor a retirar.
     */
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


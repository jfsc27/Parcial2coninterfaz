package co.edu.uniquindio.poo;

/**
 * Clase que representa una cuenta corriente, que es un tipo específico de cuenta bancaria.
 * Tiene la capacidad de realizar sobregiros.
 */
public class CuentaCorriente extends CuentaBancaria{

    /** El límite de sobregiro asociado a la cuenta corriente. */
    private double sobregiro;

    /**
     * Constructor de la clase CuentaCorriente.
     * @param numeroCuenta El número de la cuenta corriente.
     * @param saldo El saldo inicial de la cuenta corriente.
     * @param estadoCuenta El estado de la cuenta corriente (activo o inactivo).
     * @param titular El titular de la cuenta corriente.
     * @param sobregiro El límite de sobregiro permitido para la cuenta corriente.
     */
    public CuentaCorriente(String numeroCuenta, double saldo, boolean estadoCuenta, Titular titular, double sobregiro) {
        super(numeroCuenta, saldo, estadoCuenta, titular);
        this.sobregiro = sobregiro;
    }

    /**
     * Obtiene el límite de sobregiro de la cuenta corriente.
     * @return El límite de sobregiro.
     */
    public double getSobregiro() {
        return sobregiro;
    }

    /**
     * Establece el límite de sobregiro de la cuenta corriente.
     * @param sobregiro El nuevo límite de sobregiro a establecer.
     */
    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    /**
     * Método para retirar dinero de la cuenta corriente, que puede permitir sobregiros.
     * @param valor El valor a retirar.
     */
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

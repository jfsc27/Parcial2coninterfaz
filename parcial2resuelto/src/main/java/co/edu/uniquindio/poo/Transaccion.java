package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Clase que representa una transacción realizada en una cuenta bancaria.
 * Cada transacción tiene un código único, un valor, una fecha, una descripción,
 * un estado de cuenta y un tipo de transacción (retiro o depósito).
 */
public class Transaccion {
    /** Código único de la transacción. */
    private final String codigo;

    /** Valor de la transacción. */
    private final int valor;

    /** Fecha en que se realizó la transacción. */
    private final LocalDate fecha;

    /** Descripción de la transacción. */
    private final String descripcion;

    /** Estado de la cuenta después de la transacción. */
    private final boolean estadoCuenta;

    /** Tipo de la transacción (retiro o depósito). */
    private final Tipo tipo;
    
    /**
     * Constructor de la clase Transaccion.
     * @param codigo El código único de la transacción.
     * @param valor El valor de la transacción.
     * @param fecha La fecha en que se realizó la transacción.
     * @param descripcion La descripción de la transacción.
     * @param estadoCuenta El estado de la cuenta después de la transacción.
     * @param tipo El tipo de transacción (retiro o depósito).
     */
    public Transaccion(String codigo, int valor, LocalDate fecha, String descripcion, boolean estadoCuenta, Tipo tipo) {
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estadoCuenta = estadoCuenta;
        this.tipo = tipo;
    }

    /**
     * Obtiene el código único de la transacción.
     * @return El código único de la transacción.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el valor de la transacción.
     * @return El valor de la transacción.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Obtiene la fecha en que se realizó la transacción.
     * @return La fecha de la transacción.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Obtiene la descripción de la transacción.
     * @return La descripción de la transacción.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene el estado de la cuenta después de la transacción.
     * @return true si la cuenta está activa después de la transacción, false si está inactiva.
     */
    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }

    /**
     * Obtiene el tipo de la transacción.
     * @return El tipo de la transacción (retiro o depósito).
     */
    public Tipo getTipo() {
        return tipo;
    }

}


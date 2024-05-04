package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
    private final String codigo;
    private final int valor;
    private final LocalDate fecha;
    private final String descripcion;
    private final boolean estadoCuenta;
    private final Tipo tipo;
    
    public Transaccion(String codigo, int valor, LocalDate fecha, String descripcion, boolean estadoCuenta, Tipo tipo) {
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estadoCuenta = estadoCuenta;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getValor() {
        return valor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }

    public Tipo getTipo() {
        return tipo;
    }

}

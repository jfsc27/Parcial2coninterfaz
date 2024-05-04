package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Banco {
    private final String nombre;
    private final Collection<Titular> listaTitulares;
    private final Collection<CuentaBancaria> listaCuentas;
    public Banco(String nombre) {
        this.nombre = nombre;
        this.listaTitulares = new LinkedList<>();
        this.listaCuentas = new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public Collection<Titular> getListaTitulares() {
        return listaTitulares;
    }
    public Collection<CuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }

    
    
}

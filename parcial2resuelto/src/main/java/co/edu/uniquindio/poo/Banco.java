package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Representa un banco que contiene una lista de titulares y una lista de cuentas bancarias.
 */
public class Banco {
    
    /** El nombre del banco. 
     * 
     */
    private final String nombre;
    
    /** La lista de titulares asociados al banco. 
     * 
     */
    private final Collection<Titular> listaTitulares;
    
    /** La lista de cuentas bancarias asociadas al banco. 
     * 
     */
    private final Collection<CuentaBancaria> listaCuentas;
    
    /**
     * Constructor de la clase Banco.
     * @param nombre El nombre del banco.
     */
    public Banco(String nombre) {
        this.nombre = nombre;
        this.listaTitulares = new LinkedList<>();
        this.listaCuentas = new LinkedList<>();
    }
    
    /**
     * Obtiene el nombre del banco.
     * @return El nombre del banco.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene la lista de titulares asociados al banco.
     * @return La lista de titulares.
     */
    public Collection<Titular> getListaTitulares() {
        return listaTitulares;
    }
    
    /**
     * Obtiene la lista de cuentas bancarias asociadas al banco.
     * @return La lista de cuentas bancarias.
     */
    public Collection<CuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }
}


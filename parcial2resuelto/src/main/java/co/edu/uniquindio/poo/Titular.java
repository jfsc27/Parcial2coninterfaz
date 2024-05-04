package co.edu.uniquindio.poo;

/**
 * Clase que representa a un titular de una cuenta bancaria.
 * Cada titular tiene un nombre y un apellido.
 */
public class Titular {
    /** Nombre del titular. */
    private final String nombre;

    /** Apellido del titular. */
    private final String apellido;
    
    /**
     * Constructor de la clase Titular.
     * @param nombre El nombre del titular.
     * @param apellido El apellido del titular.
     */
    public Titular(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Obtiene el nombre del titular.
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el apellido del titular.
     * @return El apellido del titular.
     */
    public String getApellido() {
        return apellido;
    }
}


package co.edu.uniquindio.poo;

public class Titular {
    private final String nombre;
    private final String apellido;
    
    public Titular(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
}

package _10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Setter para la relación bidireccional
    public void setCuenta(CuentaBancaria cuenta) {
        if (this.cuenta != cuenta) {
            this.cuenta = cuenta;
            if (cuenta != null) {
                cuenta.setTitular(this);
            }
        }
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", cuenta=" + (cuenta != null ? cuenta.getCbu() : "null") +
                '}';
    }
}
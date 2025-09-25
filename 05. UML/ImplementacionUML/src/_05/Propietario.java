package _05;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        // Evita el bucle infinito
        if (this.computadora != computadora) {
            this.computadora = computadora;
            if (computadora != null) {
                computadora.setPropietario(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", computadora=" + (computadora != null ? computadora.getNumeroSerie() : "null") +
                '}';
    }
}
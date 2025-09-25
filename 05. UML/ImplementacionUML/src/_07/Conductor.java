package _07;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    // Setter para la relación bidireccional con Vehiculo
    public void setVehiculo(Vehiculo vehiculo) {
        if (this.vehiculo != vehiculo) {
            this.vehiculo = vehiculo;
            if (vehiculo != null) {
                vehiculo.setConductor(this);
            }
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", licencia='" + licencia + '\'' +
                ", vehiculo=" + (vehiculo != null ? vehiculo.getPatente() : "null") +
                '}';
    }
}
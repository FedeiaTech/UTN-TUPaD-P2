package _01;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Método para establecer la asociación bidireccional con Pasaporte
    public void setPasaporte(Pasaporte pasaporte) {
         if (this.pasaporte != pasaporte) {
            this.pasaporte = pasaporte;
            if (pasaporte != null) {
                pasaporte.setTitular(this);
            }
        }
    }

    // Getters y toString...
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", pasaporte=" + (pasaporte != null ? pasaporte.getNumero() : "null") +
                '}';
    }
}
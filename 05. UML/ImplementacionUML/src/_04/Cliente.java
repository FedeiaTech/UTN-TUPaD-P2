package _04;

public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
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

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    // Setter para la relación bidireccional
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        if (this.tarjeta != tarjeta) {
            this.tarjeta = tarjeta;
            if (tarjeta != null) {
                tarjeta.setCliente(this);
            }
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", tarjeta=" + (tarjeta != null ? tarjeta.getNumero() : "null") +
                '}';
    }
}
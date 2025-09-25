package _01;

import java.util.Date;

public class Pasaporte {
    private String numero;
    private Date fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, Date fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
    }

    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    // Método para manejar la composición con la Foto
    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    // Método para establecer la asociación bidireccional con Titular
    public void setTitular(Titular titular) {
        if (this.titular != titular) {
            this.titular = titular;
            if (titular != null) {
                titular.setPasaporte(this);
            }
        }
    }

    // Getters y toString...
    public String getNumero() {
        return numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", foto=" + (foto != null ? foto.toString() : "null") +
                ", titular=" + (titular != null ? titular.getNombre() : "null") +
                '}';
    }
}
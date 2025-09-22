package _01;

import java.util.Date;

public class Pasaporte {
    private String numero;
    private Date fechaEmision;
    // Composición: el ciclo de vida de la Foto depende del Pasaporte
    private Foto foto;
    // Asociación bidireccional: un Pasaporte tiene un Titular
    private Titular titular;

    public Pasaporte(String numero, Date fechaEmision, String imagen, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // La composición se implementa creando la Foto dentro del constructor del Pasaporte
        this.foto = new Foto(imagen, formato);
        this.titular = titular;
        // Se establece la referencia bidireccional en el objeto Titular
        this.titular.setPasaporte(this);
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    // En composición, no se suele tener un setter para el objeto contenido
    // public void setFoto(Foto foto) { this.foto = foto; }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero='" + numero + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", foto=" + foto +
                ", titular=" + titular.getNombre() + " (" + titular.getDni() + ")" +
                '}';
    }
}
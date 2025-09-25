package _02;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Setters
    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Setter para la asociación de agregación con Bateria
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    // Setter para la asociación bidireccional con Usuario
    public void setUsuario(Usuario usuario) {
        if (this.usuario != usuario) {
            this.usuario = usuario;
            if (usuario != null) {
                usuario.setCelular(this);
            }
        }
    }

    // Getters y toString
    public Bateria getBateria() {
        return bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "imei='" + imei + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bateria=" + (bateria != null ? bateria.getModelo() : "null") +
                ", usuario=" + (usuario != null ? usuario.getNombre() : "null") +
                '}';
    }
}
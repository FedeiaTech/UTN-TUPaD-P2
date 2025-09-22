package _02;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    // Agregación: el Celular tiene una referencia a un objeto Batería,
    // que puede existir de forma independiente.
    private Bateria bateria;
    // Asociación bidireccional: un Celular tiene un Usuario.
    private Usuario usuario;
    
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // Se recibe el objeto Bateria ya creado
        this.usuario = usuario;
        // Establecer la relación bidireccional en el objeto Usuario
        this.usuario.setCelular(this);
    }
    
    // Getters y Setters
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

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public String toString() {
        return "Celular{" +
                "imei='" + imei + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
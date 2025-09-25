package _05;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    // El constructor ahora solo inicializa sus propios atributos
    public Computadora(String marca, String numeroSerie) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
    }
    
    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    // Setter para la composición con PlacaMadre
    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public void setPropietario(Propietario propietario) {
        // Evita el bucle infinito
        if (this.propietario != propietario) {
            this.propietario = propietario;
            if (propietario != null) {
                propietario.setComputadora(this);
            }
        }
    }
    
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", placaMadre=" + (placaMadre != null ? placaMadre.getModelo() : "null") +
                ", propietario=" + (propietario != null ? propietario.getNombre() : "null") +
                '}';
    }
}
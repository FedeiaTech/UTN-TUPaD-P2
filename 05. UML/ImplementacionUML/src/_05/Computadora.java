package _05;

public class Computadora {
    private String marca;
    private String numeroSerie;
    // Composición: la PlacaMadre es una parte intrínseca
    private PlacaMadre placaMadre;
    // Asociación bidireccional con el Propietario
    private Propietario propietario;
    
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // La PlacaMadre se crea dentro del constructor de Computadora (composición)
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
        // Se recibe el objeto Propietario
        this.propietario = propietario;
        // Se establece la referencia bidireccional en el objeto Propietario
        this.propietario.setComputadora(this);
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

    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    public void setPlacaMadre(PlacaMadre placaMadre) {
        this.placaMadre = placaMadre;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                '}';
    }
}
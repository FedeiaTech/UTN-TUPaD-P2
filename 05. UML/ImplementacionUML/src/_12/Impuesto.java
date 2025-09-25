package _12;

public class Impuesto {
    private double monto;
    // Asociación unidireccional
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    // Getters y Setters
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    // Setter para la asociación unidireccional
    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
}
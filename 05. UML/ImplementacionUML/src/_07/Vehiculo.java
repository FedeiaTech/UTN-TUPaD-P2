package _07;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    // Getters y Setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Setter para la agregación con Motor
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        if (this.conductor != conductor) {
            this.conductor = conductor;
            if (conductor != null) {
                conductor.setVehiculo(this);
            }
        }
    }
    
    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + (motor != null ? motor.getNumeroSerie() : "null") +
                ", conductor=" + (conductor != null ? conductor.getNombre() : "null") +
                '}';
    }
}
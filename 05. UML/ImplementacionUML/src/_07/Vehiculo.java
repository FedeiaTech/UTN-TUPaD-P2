package _07;

public class Vehiculo {
    private String patente;
    private String modelo;
    // Agregación: el Vehículo tiene una referencia a un objeto Motor ya existente
    private Motor motor;
    // Asociación bidireccional: el Vehículo tiene una referencia a un Conductor
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor; // Se recibe el objeto Motor para la agregación
        this.conductor = conductor;
        // Establecer la relación bidireccional en el objeto Conductor
        this.conductor.setVehiculo(this);
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
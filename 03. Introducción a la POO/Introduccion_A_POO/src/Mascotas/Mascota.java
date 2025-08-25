package Mascotas;

public class Mascota {

    private String nombre;
    private String especie;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        // Validación para que la edad no sea negativa
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

    // Métodos 
    public void mostrarInfo() {
        System.out.println("Información de la Mascota:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Edad: " + getEdad() + " años");
    }

    public void cumplirAnios() {
        // Aumenta la edad de la mascota en 1
        this.edad += 1;
        System.out.println("¡Feliz cumpleaños, " + getNombre() + "! Ahora tiene " + getEdad() + " años.");
    }
}


package Gallinas;

public class Gallina {

    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        } else {
            System.out.println("Error: El número de huevos no puede ser negativo.");
        }
    }

    // Getters
    public int getIdGallina() {
        return idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    // Métodos
    public void ponerHuevo() {
        this.huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        this.edad++;
        System.out.println("La gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("--- Estado de la Gallina " + idGallina + " ---");
        System.out.println("ID: " + getIdGallina());
        System.out.println("Edad: " + getEdad() + " años");
        System.out.println("Huevos puestos: " + getHuevosPuestos());
    }
}

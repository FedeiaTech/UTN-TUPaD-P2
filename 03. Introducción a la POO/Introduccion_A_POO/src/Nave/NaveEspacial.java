package Nave;

public class NaveEspacial {

    private String nombre;
    private double combustible;
    private final double CAPACIDAD_MAXIMA = 100.0; // Constante para el límite de combustible

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= CAPACIDAD_MAXIMA) {
            this.combustible = combustible;
        } else {
            System.out.println("Error: Cantidad de combustible inicial inválida.");
        }
    }

    // Métodos
    public void despegar() {
        if (this.combustible >= 10) { // Se asume que despegar consume 10 unidades
            this.combustible -= 10;
            System.out.println("¡Despegue exitoso! Consumo de 10 unidades de combustible.");
        } else {
            System.out.println("No hay suficiente combustible para el despegue.");
        }
    }

    public void avanzar(double distancia) {
        double consumo = distancia / 10; // Se asume que cada 10 km consume 1 unidad
        if (this.combustible >= consumo) {
            this.combustible -= consumo;
            System.out.println("La nave " + nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + String.format("%.2f", this.combustible));
        } else {
            System.out.println("¡Alerta! No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (this.combustible + cantidad <= CAPACIDAD_MAXIMA) {
            this.combustible += cantidad;
            System.out.println("Recarga exitosa. Se añadieron " + cantidad + " unidades. Combustible total: " + String.format("%.2f", this.combustible));
        } else {
            System.out.println("Error: La cantidad a recargar excede la capacidad máxima de " + CAPACIDAD_MAXIMA + " unidades.");
        }
    }

    public void mostrarEstado() {
        System.out.println("--- Estado de la Nave Espacial ---");
        System.out.println("Nombre de la nave: " + getNombre());
        System.out.println("Combustible actual: " + String.format("%.2f", getCombustible()));
        System.out.println("---------------------------------");
    }
}
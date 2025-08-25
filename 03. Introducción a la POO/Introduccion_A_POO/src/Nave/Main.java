package Nave;

public class Main {
    public static void main(String[] args) {
        // Crea una nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial();
        nave.setNombre("Apolo 8");
        nave.setCombustible(50.0);

        // Mostrar estado inicial
        System.out.println(">>> Estado inicial de la nave:");
        nave.mostrarEstado();

        // Intentar avanzar una distancia que consuma más de 50 unidades
        System.out.println(">>> Intentando avanzar una distancia de 600...");
        nave.avanzar(600);
        System.out.println("---------------------------------");
        nave.mostrarEstado();

        // Recargar combustible hasta el límite
        System.out.println(">>> Recargando combustible con 55 unidades...");
        nave.recargarCombustible(55.0); // Excede el límite de 100
        System.out.println("---------------------------------");
        
        System.out.println(">>> Recargando combustible con 50 unidades...");
        nave.recargarCombustible(50.0);
        System.out.println("---------------------------------");

        // Avanzar después de la recarga
        System.out.println(">>> Intentando avanzar una distancia de 800...");
        nave.avanzar(800);
        System.out.println("---------------------------------");

        // Mostrar el estado final
        System.out.println(">>> Estado final de la nave:");
        nave.mostrarEstado();
    }
}
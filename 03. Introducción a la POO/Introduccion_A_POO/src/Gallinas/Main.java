package Gallinas;

public class Main {
    public static void main(String[] args) {
        // Crea dos gallinas
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(1);
        gallina1.setEdad(1);
        gallina1.setHuevosPuestos(5);

        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(2);
        gallina2.setEdad(2);
        gallina2.setHuevosPuestos(10);

        System.out.println("--- Estado inicial de las gallinas ---");
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
        System.out.println("--------------------------------------");

        // Simular acciones
        System.out.println("Simulando acciones...");
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        
        System.out.println();
        
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        System.out.println("--------------------------------------");

        // Mostrar estado final
        System.out.println("--- Estado final de las gallinas ---");
        gallina1.mostrarEstado();
        System.out.println();
        gallina2.mostrarEstado();
        System.out.println("--------------------------------------");
    }
}
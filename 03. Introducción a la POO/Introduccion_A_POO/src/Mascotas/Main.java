package Mascotas;

public class Main {

    public static void main(String[] args) {
        // Crear una mascota
        Mascota miMascota = new Mascota();
        
        // Usar los setters para inicializar sus atributos
        miMascota.setNombre("Max");
        miMascota.setEspecie("Perro");
        miMascota.setEdad(3);

        // Mostrar su información inicial
        System.out.println("Estado inicial de la mascota:");
        miMascota.mostrarInfo();
        System.out.println("--------------------");

        // Simular el paso del tiempo y verificar
        System.out.println("Simulando el paso de un año...");
        miMascota.cumplirAnios();
        System.out.println("--------------------");

        // Mostrar la información actualizada para verificar el cambio
        System.out.println("Estado actualizado de la mascota:");
        miMascota.mostrarInfo();
        System.out.println("--------------------");
    }
}
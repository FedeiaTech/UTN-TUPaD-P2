package _07;

public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Motor y Conductor de forma independiente
        Motor motor = new Motor("Diesel", "MN-8574-ABC");
        Conductor conductor = new Conductor("Juan Pablo", "LIC-789");

        // Crear el objeto Vehiculo, pasando las instancias de Motor y Conductor
        Vehiculo vehiculo = new Vehiculo(
                "AB-123-CD",
                "Ford Ranger",
                motor,
                conductor
        );

        // Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles del vehiculo: " + vehiculo);
        System.out.println("Motor del vehiculo: " + vehiculo.getMotor().getTipo());
        System.out.println("Conductor del vehiculo: " + vehiculo.getConductor().getNombre());

        // Verificar la bidireccionalidad
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Vehiculo del conductor: " + conductor.getVehiculo().getPatente());
    }
}
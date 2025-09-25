package _07;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de Motor y Conductor de forma independiente
        Motor motor = new Motor("Diesel", "MN-8574-ABC");
        Conductor conductor = new Conductor("Juan Pablo", "LIC-789");

        // 2. Crear el objeto Vehiculo sin sus asociaciones
        Vehiculo vehiculo = new Vehiculo("AB-123-CD", "Ford Ranger");

        // 3. Establecer las relaciones usando los setters
        vehiculo.setMotor(motor);
        vehiculo.setConductor(conductor);

        // 4. Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles del vehiculo: " + vehiculo);
        System.out.println("Motor del vehiculo: " + vehiculo.getMotor().getTipo());
        System.out.println("Conductor del vehiculo: " + vehiculo.getConductor().getNombre());

        // 5. Verificar la bidireccionalidad
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Vehiculo del conductor: " + conductor.getVehiculo().getPatente());
    }
}
package _06;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Cliente y Mesa de forma independiente
        Cliente cliente = new Cliente("Sofia Ramirez", "555-1234");
        Mesa mesa = new Mesa(5, 4);

        // Crear el objeto Reserva, pasando las instancias de Cliente y Mesa
        Reserva reserva = new Reserva(
            new Date(), 
            "20:30", 
            cliente, 
            mesa
        );

        // Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles de la reserva: " + reserva);
        System.out.println("Cliente de la reserva: " + reserva.getCliente().getNombre());
        System.out.println("Mesa de la reserva: " + reserva.getMesa().getNumero());
    }
}
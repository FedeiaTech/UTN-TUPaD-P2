package _06;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de Cliente y Mesa de forma independiente
        Cliente cliente = new Cliente("Sofia Ramirez", "555-1234");
        Mesa mesa = new Mesa(5, 4);

        // 2. Crear el objeto Reserva sin sus asociaciones
        Reserva reserva = new Reserva(new Date(), "20:30");
        
        // 3. Establecer las relaciones usando los setters
        reserva.setCliente(cliente);
        reserva.setMesa(mesa);

        // 4. Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles de la reserva: " + reserva);
        System.out.println("Cliente de la reserva: " + reserva.getCliente().getNombre());
        System.out.println("Mesa de la reserva: " + reserva.getMesa().getNumero());
    }
}
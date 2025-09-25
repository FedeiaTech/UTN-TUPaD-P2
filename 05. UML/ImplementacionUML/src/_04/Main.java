package _04;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de Cliente y Banco de forma independiente
        Cliente cliente = new Cliente("Ana Torres", "11223344");
        Banco banco = new Banco("Banco Central", "30-12345678-9");

        // 2. Crear el objeto TarjetaDeCredito sin sus asociaciones
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4567-8901-2345-6789", new Date());

        // 3. Establecer las relaciones usando los setters
        tarjeta.setCliente(cliente);
        tarjeta.setBanco(banco);

        // 4. Imprimir los detalles para verificar que las relaciones son correctas
        System.out.println("Detalles de la tarjeta: " + tarjeta);
        System.out.println("Cliente de la tarjeta: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco de la tarjeta: " + tarjeta.getBanco().getNombre());

        // 5. Verificar la bidireccionalidad
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Tarjeta del cliente: " + cliente.getTarjeta().getNumero());
    }
}
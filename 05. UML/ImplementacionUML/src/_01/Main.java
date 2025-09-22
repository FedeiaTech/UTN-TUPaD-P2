package _01;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto Titular primero
        Titular titular = new Titular("Juan Perez", "12345678");

        // Crear el objeto Pasaporte, que internamente creará la Foto
        // y establecerá la relación bidireccional con el Titular
        Pasaporte pasaporte = new Pasaporte(
                "AB12345",
                new Date(),
                "foto_juan.jpg",
                "JPEG",
                titular
        );

        // Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles del pasaporte: " + pasaporte);
        System.out.println("Detalles de la foto: " + pasaporte.getFoto());
        System.out.println("Detalles del titular: " + pasaporte.getTitular());
        
        // Verificar la bidireccionalidad
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Pasaporte desde el titular: " + titular.getPasaporte().getNumero());
    }
}
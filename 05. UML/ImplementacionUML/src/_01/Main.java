package _01;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Titular
        Titular titular = new Titular("Juan Perez", "12345678");

        // 2. Crear el objeto Pasaporte
        Pasaporte pasaporte = new Pasaporte("AB12345", new Date());

        // 3. Crear el objeto Foto
        Foto foto = new Foto("foto_juan.jpg", "JPEG");

        // 4. Establecer las relaciones usando los setters
        pasaporte.setFoto(foto);
        pasaporte.setTitular(titular); // Esto también establece la relación en el objeto Titular

        // 5. Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles del pasaporte: " + pasaporte);
        System.out.println("Detalles de la foto: " + pasaporte.getFoto());
        System.out.println("Detalles del titular: " + pasaporte.getTitular());
        
        // 6. Verificar la bidireccionalidad desde el titular
        System.out.println("\nVerificando relación bidireccional:");
       if (titular.getPasaporte() != null) {
            System.out.println("Pasaporte desde el titular: " + titular.getPasaporte().getNumero());
        } else {
            System.out.println("Error: el titular no tiene un pasaporte asignado.");
        }
    }
}
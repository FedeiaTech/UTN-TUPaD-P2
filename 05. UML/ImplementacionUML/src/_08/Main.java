package _08;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Usuario de forma independiente
        Usuario usuario = new Usuario("Pedro Alva", "pedro.alva@mail.com");

        // 2. Crear el objeto FirmaDigital
        FirmaDigital firma = new FirmaDigital("HASH12345", new Date());

        // 3. Crear el objeto Documento
        Documento documento = new Documento("Contrato de servicios", "Este contrato detalla los términos...");

        // 4. Establecer las relaciones usando los setters
        firma.setUsuario(usuario);
        documento.setFirmaDigital(firma);

        // 5. Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles del documento: " + documento.getTitulo());
        System.out.println("Código de firma digital: " + documento.getFirmaDigital().getCodigoHash());
        System.out.println("Usuario que firmó: " + documento.getFirmaDigital().getUsuario().getNombre());
    }
}
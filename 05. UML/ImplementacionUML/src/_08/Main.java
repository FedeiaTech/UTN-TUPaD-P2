package _08;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto Usuario de forma independiente
        Usuario usuario = new Usuario("Pedro Alva", "pedro.alva@mail.com");

        // Crear el objeto Documento. Este, a su vez, creará la FirmaDigital.
        Documento documento = new Documento(
                "Contrato de servicios",
                "Este contrato detalla los términos...",
                "HASH12345",
                new Date(),
                usuario
        );

        // Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles del documento: " + documento.getTitulo());
        System.out.println("Código de firma digital: " + documento.getFirmaDigital().getCodigoHash());
        System.out.println("Usuario que firmó: " + documento.getFirmaDigital().getUsuario().getNombre());
    }
}
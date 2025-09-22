package _10;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear la instancia de Titular de forma independiente
        Titular titular = new Titular("Roberto Perez", "22556677");

        // Crear el objeto CuentaBancaria, que internamente creará la ClaveSeguridad
        CuentaBancaria cuenta = new CuentaBancaria(
                "0070002199200001234567",
                1500.75,
                "XYZ123ABC",
                new Date(),
                titular
        );

        // Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles de la cuenta: " + cuenta);
        System.out.println("Código de seguridad: " + cuenta.getClave().getCodigo());
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());

        // Verificar la bidireccionalidad
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Cuenta del titular: " + titular.getCuenta().getCbu());
    }
}
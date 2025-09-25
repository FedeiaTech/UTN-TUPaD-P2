package _10;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de Titular y ClaveSeguridad de forma independiente
        Titular titular = new Titular("Roberto Perez", "22556677");
        ClaveSeguridad clave = new ClaveSeguridad("XYZ123ABC", new Date());

        // 2. Crear el objeto CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("0070002199200001234567", 1500.75);

        // 3. Establecer las relaciones usando los setters
        cuenta.setClave(clave);
        cuenta.setTitular(titular);

        // 4. Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles de la cuenta: " + cuenta);
        System.out.println("Código de seguridad: " + cuenta.getClave().getCodigo());
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());

        // 5. Verificar la bidireccionalidad
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Cuenta del titular: " + titular.getCuenta().getCbu());
    }
}
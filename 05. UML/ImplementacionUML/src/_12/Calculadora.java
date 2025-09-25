package _12;

public class Calculadora {
    // Dependencia de uso: el método calcular()
    public void calcular(Impuesto impuesto) {
        // Se valida que el contribuyente exista antes
        if (impuesto.getContribuyente() != null) {
            System.out.println("Calculando impuesto para: " + impuesto.getContribuyente().getNombre());
        } else {
            System.out.println("Calculando impuesto para un contribuyente no especificado.");
        }
        System.out.println("El monto del impuesto es: $" + impuesto.getMonto());
        // Simulación de lógica de cálculo
        double total = impuesto.getMonto() * 1.21; // Agrega un 21% de IVA
        System.out.println("Monto total con recargos: $" + String.format("%.2f", total));
    }
}
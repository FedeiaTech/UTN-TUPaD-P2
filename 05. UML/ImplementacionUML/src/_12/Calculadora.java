package _12;

public class Calculadora {
    // Dependencia de uso: el método calcular() utiliza un objeto Impuesto
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto para: " + impuesto.getContribuyente().getNombre());
        System.out.println("El monto del impuesto es: $" + impuesto.getMonto());
        // Lógica de cálculo ficticia
        double total = impuesto.getMonto() * 1.21; // Agrega un 21% de IVA
        System.out.println("Monto total con recargos: $" + String.format("%.2f", total));
    }
}
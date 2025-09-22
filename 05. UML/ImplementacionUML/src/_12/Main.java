package _12;

public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Contribuyente e Impuesto
        Contribuyente contribuyente = new Contribuyente("Ana Maria Garcia", "27-12345678-9");
        Impuesto impuesto = new Impuesto(1500.00, contribuyente);

        // Crear la calculadora
        Calculadora calculadora = new Calculadora();

        // Demostrar la dependencia de uso al pasar el objeto impuesto como parámetro
        calculadora.calcular(impuesto);
    }
}
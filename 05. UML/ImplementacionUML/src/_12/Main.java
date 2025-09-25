package _12;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de Contribuyente e Impuesto de forma independiente
        Contribuyente contribuyente = new Contribuyente("Ana Maria Garcia", "27-12345678-9");
        Impuesto impuesto = new Impuesto(1500.00);

        // 2. Establecer la relación usando el setter
        impuesto.setContribuyente(contribuyente);

        // 3. Crear la calculadora
        Calculadora calculadora = new Calculadora();

        // 4. Demostrar la dependencia de uso al pasar el objeto impuesto como parámetro
        calculadora.calcular(impuesto);
    }
}
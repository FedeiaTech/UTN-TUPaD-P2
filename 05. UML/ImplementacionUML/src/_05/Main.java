package _05;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto Propietario primero
        Propietario propietario = new Propietario("Carlos Gomez", "99887766");
        
        // Crear el objeto Computadora, que internamente creará la PlacaMadre
        Computadora computadora = new Computadora(
            "Dell",
            "DELL-12345",
            "ASUS Prime B450",
            "AMD B450",
            propietario
        );

        // Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles de la computadora: " + computadora);
        System.out.println("Placa Madre de la computadora: " + computadora.getPlacaMadre());
        System.out.println("Propietario de la computadora: " + computadora.getPropietario().getNombre());
        
        // Verificar la bidireccionalidad
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Computadora del propietario: " + propietario.getComputadora().getMarca());
    }
}
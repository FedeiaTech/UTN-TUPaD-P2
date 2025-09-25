package _05;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Propietario primero
        Propietario propietario = new Propietario("Carlos Gomez", "99887766");
        
        // 2. Crear el objeto Computadora
        Computadora computadora = new Computadora("Dell", "DELL-12345");
        
        // 3. Crear el objeto PlacaMadre
        PlacaMadre placaMadre = new PlacaMadre("ASUS Prime B450", "AMD B450");
        
        // 4. Establecer las relaciones usando los setters
        computadora.setPlacaMadre(placaMadre);
        computadora.setPropietario(propietario);

        // 5. Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles de la computadora: " + computadora);
        System.out.println("Placa Madre de la computadora: " + computadora.getPlacaMadre());
        
        // 6. Verificar la bidireccionalidad desde el propietario
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Computadora del propietario: " + propietario.getComputadora().getMarca());
    }
}
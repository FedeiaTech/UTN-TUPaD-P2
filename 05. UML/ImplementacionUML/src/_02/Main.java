package _02;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto Bateria primero, demostrando su existencia independiente
        Bateria bateria = new Bateria("Li-Ion 5000", 5000);
        
        // Crear el objeto Usuario
        Usuario usuario = new Usuario("Maria Lopez", "87654321");

        // Crear el objeto Celular, pasando la Bateria y el Usuario ya creados
        Celular celular = new Celular(
            "987654321", 
            "Samsung", 
            "Galaxy S23", 
            bateria, 
            usuario
        );

        // Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles del celular: " + celular);
        System.out.println("Bateria del celular: " + celular.getBateria());
        System.out.println("Usuario del celular: " + celular.getUsuario().getNombre());
        
        // Verificar la bidireccionalidad
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
    }
}
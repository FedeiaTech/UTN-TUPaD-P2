package _02;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el objeto Bateria primero
        Bateria bateria = new Bateria("Li-Ion 5000", 5000);
        
        // 2. Crear el objeto Usuario
        Usuario usuario = new Usuario("Maria Lopez", "87654321");

        // 3. Crear el objeto Celular
        Celular celular = new Celular("987654321", "Samsung", "Galaxy S23");

        // 4. Establecer las relaciones usando los setters
        celular.setBateria(bateria);
        celular.setUsuario(usuario); // Esto también vincula al Celular en el objeto Usuario

        // 5. Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles del celular: " + celular);
        System.out.println("Bateria del celular: " + celular.getBateria());
        
        // Verificar la bidireccionalidad desde el usuario
        System.out.println("\nVerificando relación bidireccional:");
        System.out.println("Celular del usuario: " + usuario.getCelular().getMarca() + " " + usuario.getCelular().getModelo());
    }
}
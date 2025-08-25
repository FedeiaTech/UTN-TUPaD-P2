package Libros;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Libro y establecer sus atributos
        Libro miLibro = new Libro();
        miLibro.setTitulo("Cien Años de Soledad");
        miLibro.setAutor("Gabriel García Márquez");
        miLibro.setAnoPublicacion(1967); // Año de publicación inicial

        // Mostrar la información inicial del libro
        System.out.println("Estado Inicial:");
        miLibro.mostrarInfo();
        System.out.println("--------------------");

        // Tarea: Intentar modificar el año con un valor inválido
        System.out.println("Intentando modificar el año a 2030 (inválido)...");
        miLibro.setAnoPublicacion(2030); // Este valor será rechazado por la validación
        System.out.println("--------------------");

        // Intentar modificar el año con un valor válido
        System.out.println("Intentando modificar el año a 1982 (válido)...");
        miLibro.setAnoPublicacion(1982); // Este valor será aceptado
        System.out.println("--------------------");

        // Mostrar la información final para verificar los cambios
        System.out.println("Estado Final:");
        miLibro.mostrarInfo();
        System.out.println("--------------------");
    }
}
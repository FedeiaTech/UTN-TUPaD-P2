package _03;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de Autor y Editorial de forma independiente
        Autor autor = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Editorial editorial = new Editorial("Sudamericana", "Av. San Juan 123");

        // 2. Crear el objeto Libro sin sus asociaciones
        Libro libro = new Libro("Cien años de soledad", "978-3-16-148410-0");
        
        // 3. Establecer las relaciones usando los setters
        libro.setAutor(autor);
        libro.setEditorial(editorial);

        // 4. Imprimir los detalles para verificar que las relaciones son correctas
        System.out.println("Detalles del libro: " + libro);
        System.out.println("El autor es: " + libro.getAutor().getNombre());
        System.out.println("La editorial es: " + libro.getEditorial().getNombre());
    }
}
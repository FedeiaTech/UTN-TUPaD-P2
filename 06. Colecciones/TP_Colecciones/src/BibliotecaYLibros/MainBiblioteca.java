/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaYLibros;

public class MainBiblioteca {
    public static void main(String[] args) {
        
        System.out.println("--- Tarea 1: Creamos una biblioteca ---");
        Biblioteca bibliotecaCentral = new Biblioteca("Biblioteca Central");

        System.out.println("\n--- Tarea 2: Crear al menos tres autores ---");
        Autor autor1 = new Autor("AUT01", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("AUT02", "J.R.R. Tolkien", "Británico");
        Autor autor3 = new Autor("AUT03", "Isaac Asimov", "Ruso-Estadounidense");

        System.out.println("\n--- Tarea 3: Agregar 5 libros ---");
        bibliotecaCentral.agregarLibro("978-030735044", "Cien años de soledad", 1967, autor1);
        bibliotecaCentral.agregarLibro("978-0618640157", "El Señor de los Anillos", 1954, autor2);
        bibliotecaCentral.agregarLibro("978-0553293357", "Fundación", 1951, autor3);
        bibliotecaCentral.agregarLibro("978-0007117116", "El Silmarillion", 1977, autor2);
        bibliotecaCentral.agregarLibro("978-8497592208", "El amor en los tiempos del cólera", 1985, autor1);

        System.out.println("\n--- Tarea 4: Listar todos los libros ---");
        bibliotecaCentral.listarLibros();

        System.out.println("\n--- Tarea 5: Buscar libro por ISBN (978-0553293357) ---");
        Libro libroBuscado = bibliotecaCentral.buscarLibroPorIsbn("978-0553293357");
        if (libroBuscado != null) {
            System.out.println("Libro encontrado:");
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        System.out.println("\n--- Tarea 6: Filtrar libros por año (1954) ---");
        bibliotecaCentral.filtrarLibrosPorAnio(1954);

        System.out.println("\n--- Tarea 7: Eliminar un libro (978-0007117116) y listar restantes ---");
        bibliotecaCentral.eliminarLibro("978-0007117116");
        bibliotecaCentral.listarLibros();

        System.out.println("\n--- Tarea 8: Mostrar cantidad total de libros ---");
        System.out.println("La cantidad total de libros en la biblioteca es: " + bibliotecaCentral.obtenerCantidadLibros());

        System.out.println("\n--- Tarea 9: Listar todos los autores disponibles ---");
        bibliotecaCentral.mostrarAutoresDisponibles();
    }
}
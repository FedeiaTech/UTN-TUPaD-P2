/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BibliotecaYLibros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); // Refuerza colecciones dinámicas
    }

    // --- Métodos  ---

    // Este método crea el libro, reforzando la composición
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca " + this.nombre + ".");
    }

    public void listarLibros() {
        System.out.println("\n===== LIBROS EN LA BIBLIOTECA: " + this.nombre + " =====");
        if (this.libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libroEliminar = buscarLibroPorIsbn(isbn);
        if (libroEliminar != null) {
            this.libros.remove(libroEliminar);
            System.out.println("Libro '" + libroEliminar.getTitulo() + "' (ISBN: " + isbn + ") eliminado.");
        } else {
            System.out.println("No se pudo eliminar: Libro con ISBN " + isbn + " no encontrado.");
        }
    }

    public int obtenerCantidadLibros() {
        return this.libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n===== LIBROS PUBLICADOS EN EL AÑO: " + anio + " =====");
        boolean encontrados = false;
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron libros publicados en ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\n===== AUTORES DISPONIBLES EN LA BIBLIOTECA =====");
        if (this.libros.isEmpty()) {
            System.out.println("No hay libros, por lo tanto no hay autores.");
            return;
        }
        
        // Usamos un Set para evitar mostrar autores duplicados
        Set<Autor> autores = new HashSet<>();
        for (Libro libro : this.libros) {
            autores.add(libro.getAutor());
        }

        for (Autor autor : autores) {
            autor.mostrarInfo();
        }
    }
}
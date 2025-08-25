package Libros;

public class Libro {

    private String titulo;
    private String autor;
    private int anoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        // Validación: el año no puede ser en el futuro ni antes del 1000 d.C.
        if (anoPublicacion <= 2025 && anoPublicacion >= 1000) {
            this.anoPublicacion = anoPublicacion;
            System.out.println("Año de publicación actualizado a " + anoPublicacion);
        } else {
            System.out.println("Error: El año de publicación no es válido. Debe ser entre 1000 y 2025.");
        }
    }

    // Métodos setters para inicializar los atributos
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("Información del Libro:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Año de Publicación: " + getAnoPublicacion());
    }
}
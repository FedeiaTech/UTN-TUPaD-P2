package _03;

public class Libro {
    private String titulo;
    private String isbn;
    // Asociación unidireccional con Autor
    private Autor autor;
    // Agregación con Editorial
    private Editorial editorial;

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        // Se recibe el objeto Autor
        this.autor = autor;
        // Se recibe el objeto Editorial (agregación)
        this.editorial = editorial;
    }
    
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Editorial getEditorial() {
        return editorial;
    }
    
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor.getNombre() +
                ", editorial=" + editorial.getNombre() +
                '}';
    }
}
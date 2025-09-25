package _03;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
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
    
    // Setter para la asociación unidireccional con Autor
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    // Setter para la agregación con Editorial
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public Editorial getEditorial() {
        return editorial;
    }
    
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor=" + (autor != null ? autor.getNombre() : "null") +
                ", editorial=" + (editorial != null ? editorial.getNombre() : "null") +
                '}';
    }
}
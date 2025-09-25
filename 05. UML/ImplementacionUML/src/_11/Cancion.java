package _11;

public class Cancion {
    private String titulo;
    // A. unidireccional
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    // Setter para asociación simple
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
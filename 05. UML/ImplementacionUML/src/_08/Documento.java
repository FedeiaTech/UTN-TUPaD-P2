package _08;

public class Documento {
    private String titulo;
    private String contenido;
    // Composición: 
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }
    
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }
    
    // Setter para la composición, 
    public void setFirmaDigital(FirmaDigital firmaDigital) {
        this.firmaDigital = firmaDigital;
    }
    
    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", firmaDigital=" + (firmaDigital != null ? firmaDigital.getCodigoHash() : "null") +
                '}';
    }
}
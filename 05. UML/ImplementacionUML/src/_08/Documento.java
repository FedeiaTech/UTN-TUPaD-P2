package _08;

import java.util.Date;

public class Documento {
    private String titulo;
    private String contenido;
    // Composición: el Documento contiene a la FirmaDigital
    private FirmaDigital firmaDigital;

    public Documento(String titulo, String contenido, String codigoHash, Date fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        // La FirmaDigital se crea dentro del constructor de Documento (composición)
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
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
    
    // No se implementa un setter para la composición, ya que la firma no se reemplaza
    // de forma independiente.
    
    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", firmaDigital=" + firmaDigital.getCodigoHash() +
                '}';
    }
}
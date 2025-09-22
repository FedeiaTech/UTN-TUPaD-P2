package _11;

public class Reproductor {
    // Dependencia de uso: el método reproducir() utiliza un objeto Cancion
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().getNombre());
    }
}
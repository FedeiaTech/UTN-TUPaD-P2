package _11;

public class Reproductor {
    // Dependencia de uso:
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        // Se valida si el artista existe antes de acceder a sus métodos
        if (cancion.getArtista() != null) {
            System.out.println("Artista: " + cancion.getArtista().getNombre());
        } else {
            System.out.println("Artista: Desconocido");
        }
    }
}
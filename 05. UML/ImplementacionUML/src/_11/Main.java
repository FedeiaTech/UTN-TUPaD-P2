package _11;

public class Main {
    public static void main(String[] args) {
        // Crear las instancias independientes
        Artista artista = new Artista("Queen", "Rock");
        Cancion cancion = new Cancion("Bohemian Rhapsody", artista);

        // Crear el reproductor
        Reproductor reproductor = new Reproductor();

        // Demostrar la dependencia de uso al pasar la canción como parámetro
        reproductor.reproducir(cancion);
    }
}
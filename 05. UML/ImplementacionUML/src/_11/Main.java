package _11;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las instancias independientes
        Artista artista = new Artista("Queen", "Rock");
        Cancion cancion = new Cancion("Bohemian Rhapsody");

        // 2. Establecer la relación usando el setter
        cancion.setArtista(artista);

        // 3. Crear el reproductor
        Reproductor reproductor = new Reproductor();

        //4. Demostrar la dependencia de uso al pasar la canción como parámetro
        reproductor.reproducir(cancion);
    }
}
package _14;

public class Main {
    public static void main(String[] args) {
        // Crear la instancia de Proyecto
        Proyecto proyecto = new Proyecto("Vacaciones en la playa", 5);

        // Crear el editor de video
        EditorVideo editor = new EditorVideo();

        // Demostrar la dependencia de creación al llamar al método exportar()
        Render renderFinal = editor.exportar("MP4", proyecto);

        // Se puede usar el objeto creado
        System.out.println("\nFormato del render final: " + renderFinal.getFormato());
        System.out.println("Render del proyecto: " + renderFinal.getProyecto().getNombre());
    }
}
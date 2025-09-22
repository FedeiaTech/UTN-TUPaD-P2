package _14;

public class EditorVideo {
    // Dependencia de creación: se crea un nuevo objeto Render dentro del método
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando el proyecto '" + proyecto.getNombre() + "'...");
        // Se crea la instancia de Render y se devuelve
        Render nuevoRender = new Render(formato, proyecto);
        System.out.println("Render creado en formato " + nuevoRender.getFormato());
        return nuevoRender;
    }
}
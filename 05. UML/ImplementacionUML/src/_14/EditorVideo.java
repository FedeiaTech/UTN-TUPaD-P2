package _14;

public class EditorVideo {
    // Dependencia de creación:
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando el proyecto '" + proyecto.getNombre() + "'...");
        // Se crea la instancia de Render
        Render nuevoRender = new Render(formato);
        
        // Se establece la asociación con elsetter
        nuevoRender.setProyecto(proyecto);
        
        System.out.println("Render creado en formato " + nuevoRender.getFormato());
        return nuevoRender;
    }
}
package _14;

public class Render {
    private String formato;
    // Asociación unidireccional a Proyecto
    private Proyecto proyecto;

    // El constructor solo inicializa sus propios atributos
    public Render(String formato) {
        this.formato = formato;
    }

    // Getters y Setters
    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    // Setter para la asociación unidireccional
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
}
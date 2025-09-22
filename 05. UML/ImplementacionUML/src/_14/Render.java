package _14;

public class Render {
    private String formato;
    // Asociación unidireccional a Proyecto
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    // Getters
    public String getFormato() {
        return formato;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }
}
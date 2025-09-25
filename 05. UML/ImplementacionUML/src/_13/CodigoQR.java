package _13;

public class CodigoQR {
    private String valor;
    // Asociación unidireccional a Usuario
    private Usuario usuario;

    // El constructor ahora solo inicializa sus propios atributos
    public CodigoQR(String valor) {
        this.valor = valor;
    }

    // Getters y Setters
    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    // Setter para la asociación unidireccional
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
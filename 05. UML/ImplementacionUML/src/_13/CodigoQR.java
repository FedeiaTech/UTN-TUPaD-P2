package _13;

public class CodigoQR {
    private String valor;
    // Asociación unidireccional a Usuario
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    // Getters
    public String getValor() {
        return valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
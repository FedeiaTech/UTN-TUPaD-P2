package _13;

public class GeneradorQR {
    // Dependencia de creación: se crea un nuevo objeto CodigoQR dentro del método
    public CodigoQR generar(String valor, Usuario usuario) {
        System.out.println("Generando Código QR para: " + usuario.getNombre());
        // Se crea la instancia de CodigoQR y se devuelve
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario);
        System.out.println("Código QR creado con el valor: " + nuevoCodigo.getValor());
        return nuevoCodigo;
    }
}
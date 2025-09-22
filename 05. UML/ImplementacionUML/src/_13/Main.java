package _13;

public class Main {
    public static void main(String[] args) {
        // Crear la instancia de Usuario
        Usuario usuario = new Usuario("Maria", "maria@ejemplo.com");

        // Crear el generador
        GeneradorQR generador = new GeneradorQR();

        // Demostrar la dependencia de creación al llamar al método generar()
        CodigoQR codigoGenerado = generador.generar("http://miweb.com/perfil/maria", usuario);

        // Se puede usar el objeto creado
        System.out.println("\nValor del código devuelto: " + codigoGenerado.getValor());
        System.out.println("Código asociado al usuario: " + codigoGenerado.getUsuario().getNombre());
    }
}
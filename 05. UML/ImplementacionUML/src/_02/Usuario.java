package _02;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    // Setter para la asociación bidireccional con Celular
    public void setCelular(Celular celular) {
        // Evita un bucle infinito
        if (this.celular != celular) {
            this.celular = celular;
            if (celular != null) {
                celular.setUsuario(this);
            }
        }
    }
    
    // Getters y toString
    public Celular getCelular() {
        return celular;
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", celular=" + (celular != null ? celular.getModelo() : "null") +
                '}';
    }
}
package Estudiantes;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCalificacion(double calificacion) {
        // Validación para que la calificación no sea negativa
        if (calificacion >= 0) {
            this.calificacion = calificacion;
        } else {
            System.out.println("Error: La calificación no puede ser negativa.");
        }
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Curso: " + getCurso());
        System.out.println("Calificación: " + getCalificacion());
    }

    public void subirCalificacion(double puntos) {
        if (puntos > 0) {
            this.calificacion += puntos;
            System.out.println("La calificación ha subido en " + puntos + " puntos.");
            mostrarInfo();
        } else {
            System.out.println("Error: Los puntos a subir deben ser un valor positivo.");
        }
    }

    public void bajarCalificacion(double puntos) {
        if (puntos > 0) {
            // Se asegura que la calificación no baje de 0
            if (this.calificacion - puntos >= 0) {
                this.calificacion -= puntos;
                System.out.println("La calificación ha bajado en " + puntos + " puntos.");
                mostrarInfo();
            } else {
                this.calificacion = 0;
                System.out.println("La calificación no puede ser menor a 0. Se ha establecido en 0.");
                mostrarInfo();
            }
        } else {
            System.out.println("Error: Los puntos deben ser un valor positivo.");
        }
    }
}

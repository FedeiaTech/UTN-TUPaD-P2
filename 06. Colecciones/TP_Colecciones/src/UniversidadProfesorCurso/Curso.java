/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadProfesorCurso;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // --- Métodos Sugeridos ---

    /**
     * Asigna o cambia el profesor, sincronizando ambos lados.
     * Este método es el ÚNICO que debe modificar las referencias.
     */
    public void setProfesor(Profesor nuevoProfesor) {
        // Si ya está asignado a este profesor, no hacer nada.
        if (this.profesor == nuevoProfesor) {
            return;
        }

        Profesor profesorAnterior = this.profesor;

        // 1. Quitarse del profesor previo (si existía)
        if (profesorAnterior != null) {
            this.profesor = null; // Romper enlace local
            profesorAnterior.eliminarCursoSincronizado(this); // Sincronizar lado del profesor
        }

        // 2. Asignar el nuevo profesor
        this.profesor = nuevoProfesor;

        // 3. Agregarse al nuevo profesor (si no es null)
        if (this.profesor != null) {
            this.profesor.agregarCursoSincronizado(this); // Sincronizar lado del profesor
        }
    }

    public void mostrarInfo() {
        String nombreProfesor = (this.profesor != null) ? this.profesor.getNombre() : "Sin asignar";
        System.out.println("  Curso: " + this.nombre + " (Cód: " + this.codigo + ")");
        System.out.println("    Profesor: " + nombreProfesor);
    }
    
    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
}
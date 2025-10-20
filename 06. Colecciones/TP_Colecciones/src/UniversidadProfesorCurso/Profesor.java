/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadProfesorCurso;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // --- Métodos Sugeridos ---

    // Estos métodos son llamados por el usuario o Universidad,
    // delegan la sincronización a Curso.setProfesor()
    public void agregarCurso(Curso c) {
        if (c != null) {
            c.setProfesor(this); // setProfesor se encarga de todo
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null && this.cursos.contains(c)) {
            c.setProfesor(null); // setProfesor se encarga de todo
        }
    }
    
    // --- Métodos de Sincronización Interna (Usados solo por Curso.setProfesor) ---
    
    // Añade el curso a la lista (asume que la lógica de negocio ya fue validada por setProfesor)
    protected void agregarCursoSincronizado(Curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
        }
    }

    // Quita el curso de la lista (asume que la lógica de negocio ya fue validada por setProfesor)
    protected void eliminarCursoSincronizado(Curso c) {
        this.cursos.remove(c);
    }
    

    public void listarCursos() {
        System.out.println("  Cursos dictados por " + this.nombre + ":");
        if (this.cursos.isEmpty()) {
            System.out.println("    (Ninguno)");
            return;
        }
        for (Curso c : this.cursos) {
            System.out.println("    - " + c.getNombre() + " (Cód: " + c.getCodigo() + ")");
        }
    }

    public void mostrarInfo() {
        System.out.println("\n--- Profesor: " + this.nombre + " ---");
        System.out.println("  ID: " + this.id);
        System.out.println("  Especialidad: " + this.especialidad);
        System.out.println("  Cantidad de Cursos: " + this.cursos.size());
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return new ArrayList<>(cursos); } // Devuelve copia
}
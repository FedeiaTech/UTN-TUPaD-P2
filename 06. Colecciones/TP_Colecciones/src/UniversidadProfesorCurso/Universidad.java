/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadProfesorCurso;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // --- Métodos Requeridos ---

    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
        System.out.println("Profesor " + p.getNombre() + " agregado a " + this.nombre);
    }

    public void agregarCurso(Curso c) {
        this.cursos.add(c);
        System.out.println("Curso " + c.getNombre() + " agregado a " + this.nombre);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        System.out.println("\nAsignando profesor (ID: " + idProfesor + ") a curso (Cód: " + codigoCurso + ")...");
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("Error: Curso " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("Error: Profesor " + idProfesor + " no encontrado.");
            return;
        }

        curso.setProfesor(profesor); // Aquí ocurre la magia de la sincronización
        System.out.println("Asignación completada.");
    }

    public void listarProfesores() {
        System.out.println("\n===== LISTADO DE PROFESORES (" + this.nombre + ") =====");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    public void listarCursos() {
        System.out.println("\n===== LISTADO DE CURSOS (" + this.nombre + ") =====");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Romper la relación con su profesor
            curso.setProfesor(null); 
            
            // Eliminar de la lista de la universidad
            this.cursos.remove(curso);
            System.out.println("Curso " + curso.getNombre() + " eliminado.");
        } else {
            System.out.println("Error: Curso " + codigo + " no encontrado.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Dejar en null los cursos que dictaba
            // Se usa una copia de la lista para evitar ConcurrentModificationException
            List<Curso> cursosDelProfesor = profesor.getCursos(); 
            for (Curso c : cursosDelProfesor) {
                c.setProfesor(null); // Esto sincroniza y remueve el curso de la lista interna del profesor
            }

            // Eliminar de la lista de la universidad
            this.profesores.remove(profesor);
            System.out.println("Profesor " + profesor.getNombre() + " eliminado.");
        } else {
            System.out.println("Error: Profesor " + id + " no encontrado.");
        }
    }

    // Para Tarea 8
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n===== REPORTE: CURSOS POR PROFESOR =====");
        for (Profesor p : this.profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UniversidadProfesorCurso;

public class MainUniversidad {
    public static void main(String[] args) {
        
        Universidad utn = new Universidad("UTN - FRA");

        System.out.println("--- Tarea 1 y 2: Crear y agregar 3 profesores y 5 cursos ---");
        // Profesores
        Profesor prof1 = new Profesor("P101", "Ana Gómez", "Matemáticas");
        Profesor prof2 = new Profesor("P102", "Luis Castro", "Programación");
        Profesor prof3 = new Profesor("P103", "Maria Fernandez", "Bases de Datos");
        utn.agregarProfesor(prof1);
        utn.agregarProfesor(prof2);
        utn.agregarProfesor(prof3);

        // Cursos
        Curso c1 = new Curso("C001", "Programación I");
        Curso c2 = new Curso("C002", "Programación II");
        Curso c3 = new Curso("C003", "Cálculo I");
        Curso c4 = new Curso("C004", "Álgebra");
        Curso c5 = new Curso("C005", "Bases de Datos I");
        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        System.out.println("\n--- Tarea 3: Asignar profesores a cursos ---");
        utn.asignarProfesorACurso("C001", "P102"); // Prog I -> Luis Castro
        utn.asignarProfesorACurso("C002", "P102"); // Prog II -> Luis Castro
        utn.asignarProfesorACurso("C003", "P101"); // Cálculo I -> Ana Gómez
        utn.asignarProfesorACurso("C005", "P103"); // BD I -> Maria Fernandez

        System.out.println("\n--- Tarea 4: Listar cursos y profesores (verificación de Tarea 3) ---");
        utn.listarCursos();
        utn.listarProfesores();

        System.out.println("\n--- Tarea 5: Cambiar profesor de un curso (C001) ---");
        System.out.println("Se cambiará Prog I (C001) de Luis Castro (P102) a Ana Gómez (P101)");
        utn.asignarProfesorACurso("C001", "P101");

        System.out.println("\nVerificación Tarea 5 (Sincronización):");
        System.out.println("Datos del curso C001 (debe tener P101):");
        utn.buscarCursoPorCodigo("C001").mostrarInfo();
        System.out.println("\nDatos del profesor P102 (ya NO debe tener C001):");
        utn.buscarProfesorPorId("P102").listarCursos();
        System.out.println("\nDatos del profesor P101 (SI debe tener C001 y C003):");
        utn.buscarProfesorPorId("P101").listarCursos();
        
        System.out.println("\n--- Tarea 6: Remover un curso (C002) ---");
        System.out.println("Se eliminará Prog II (C002), dictado por P102");
        utn.eliminarCurso("C002");
        System.out.println("\nVerificación Tarea 6 (Profesor P102 ya no debe tener C002):");
        utn.buscarProfesorPorId("P102").listarCursos();
        System.out.println("\nLista de cursos (C002 ya no debe aparecer):");
        utn.listarCursos();

        System.out.println("\n--- Tarea 7: Remover un profesor (P101) ---");
        System.out.println("Se eliminará a Ana Gómez (P101). Sus cursos (C001, C003) deben quedar sin profesor.");
        utn.eliminarProfesor("P101");
        System.out.println("\nVerificación Tarea 7 (Cursos C001 y C003 deben estar sin asignar):");
        utn.buscarCursoPorCodigo("C001").mostrarInfo();
        utn.buscarCursoPorCodigo("C003").mostrarInfo();
        System.out.println("\nLista de profesores (P101 ya no debe aparecer):");
        utn.listarProfesores();

        System.out.println("\n--- Tarea 8: Reporte de cantidad de cursos por profesor ---");
        utn.mostrarReporteCursosPorProfesor();
    }
}
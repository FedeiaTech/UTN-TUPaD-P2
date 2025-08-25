package Estudiantes;

public class Main {

    public static void main(String[] args) {
        // Instanciar a un estudiante
        Estudiante estudiante1 = new Estudiante();
        
        // Usar los setters para inicializar sus atributos
        estudiante1.setNombre("Ana");
        estudiante1.setApellido("López");
        estudiante1.setCurso("Matemáticas");
        estudiante1.setCalificacion(8.5);

        // Mostrar información
        System.out.println("Estado Inicial:");
        estudiante1.mostrarInfo();
        System.out.println("--------------------");

        // Aumentar y disminuir calificaciones
        System.out.println("Aumentando calificación...");
        estudiante1.subirCalificacion(1.0);
        System.out.println("--------------------");

        System.out.println("Disminuyendo calificación...");
        estudiante1.bajarCalificacion(2.0);
        System.out.println("--------------------");

    }
    
}

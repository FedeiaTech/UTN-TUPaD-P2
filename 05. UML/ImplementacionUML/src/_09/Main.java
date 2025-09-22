package _09;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Paciente y Profesional de forma independiente
        Paciente paciente = new Paciente("Lucia Lopez", "OSDE");
        Profesional profesional = new Profesional("Dr. Federico Marquez", "Cardiologia");

        // Crear el objeto CitaMedica, pasando las instancias de Paciente y Profesional
        CitaMedica cita = new CitaMedica(
            new Date(), 
            "10:00", 
            paciente, 
            profesional
        );

        // Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles de la cita: " + cita);
        System.out.println("Paciente de la cita: " + cita.getPaciente().getNombre());
        System.out.println("Profesional de la cita: " + cita.getProfesional().getNombre());
        
        // El Paciente y el Profesional no tienen una referencia a la CitaMedica,
        // demostrando la unidireccionalidad.
    }
}
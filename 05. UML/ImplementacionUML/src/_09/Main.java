package _09;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Crear las instancias de Paciente y Profesional de forma independiente
        Paciente paciente = new Paciente("Lucia Lopez", "OSDE");
        Profesional profesional = new Profesional("Dr. Federico Marquez", "Cardiologia");

        // 2. Crear el objeto CitaMedica
        CitaMedica cita = new CitaMedica(new Date(), "10:00");

        // 3. Establecer las relaciones usando los setters
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);

        // 4. Imprimir los detalles para verificar las relaciones
        System.out.println("Detalles de la cita: " + cita);
        System.out.println("Paciente de la cita: " + cita.getPaciente().getNombre());
        System.out.println("Profesional de la cita: " + cita.getProfesional().getNombre());
    }
}
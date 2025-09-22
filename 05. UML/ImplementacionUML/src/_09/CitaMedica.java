package _09;

import java.util.Date;

public class CitaMedica {
    private Date fecha;
    private String hora;
    // Asociación unidireccional a Paciente
    private Paciente paciente;
    // Asociación unidireccional a Profesional
    private Profesional profesional;

    public CitaMedica(Date fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    
    // Getters y Setters
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Profesional getProfesional() {
        return profesional;
    }
    
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                '}';
    }
}
package _06;

import java.util.Date;

public class Reserva {
    private Date fecha;
    private String hora;
    // Asociación unidireccional con Cliente
    private Cliente cliente;
    // Agregación con Mesa
    private Mesa mesa;

    public Reserva(Date fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        // Se reciben las instancias ya creadas de Cliente y Mesa
        this.cliente = cliente;
        this.mesa = mesa;
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
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    @Override
    public String toString() {
        return "Reserva{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                '}';
    }
}
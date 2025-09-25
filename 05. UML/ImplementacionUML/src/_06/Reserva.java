package _06;

import java.util.Date;

public class Reserva {
    private Date fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
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
    
    // Setter para la asociación unidireccional con Cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Setter para la agregación con Mesa
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Mesa getMesa() {
        return mesa;
    }
    
    @Override
    public String toString() {
        return "Reserva{" +
                "fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
                ", mesa=" + (mesa != null ? mesa.getNumero() : "null") +
                '}';
    }
}
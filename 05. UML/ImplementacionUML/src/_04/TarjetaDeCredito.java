package _04;

import java.util.Date;

public class TarjetaDeCredito {
    private String numero;
    private Date fechaVencimiento;
    // Asociación bidireccional: una TarjetaDeCrédito tiene un Cliente
    private Cliente cliente;
    // Agregación: una TarjetaDeCrédito está asociada a un Banco
    private Banco banco;

    public TarjetaDeCredito(String numero, Date fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        // Se recibe el objeto Cliente
        this.cliente = cliente;
        // Se recibe el objeto Banco (agregación)
        this.banco = banco;
        // Establecer la relación bidireccional en el objeto Cliente
        this.cliente.setTarjeta(this);
    }

    // Getters y Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCrédito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }
}
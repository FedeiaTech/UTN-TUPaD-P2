package _04;

import java.util.Date;

public class TarjetaDeCredito {
    private String numero;
    private Date fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    // El constructor ahora solo inicializa sus propios atributos
    public TarjetaDeCredito(String numero, Date fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
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

    // Setter para la asociación bidireccional
    public void setCliente(Cliente cliente) {
        // Evita el bucle infinito
        if (this.cliente != cliente) {
            this.cliente = cliente;
            if (cliente != null) {
                cliente.setTarjeta(this);
            }
        }
    }

    // Setter para la agregación con Banco
    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento=" + fechaVencimiento +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
                ", banco=" + (banco != null ? banco.getNombre() : "null") +
                '}';
    }
}
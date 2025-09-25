package _10;

import java.util.Date;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo) {
        this.cbu = cbu;
        this.saldo = saldo;
    }

    // Getters y Setters
    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Setter para la composición
    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    // Setter para la asociación bidireccional
    public void setTitular(Titular titular) {
        if (this.titular != titular) {
            this.titular = titular;
            if (titular != null) {
                titular.setCuenta(this);
            }
        }
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                ", clave=" + (clave != null ? clave.getCodigo() : "null") +
                ", titular=" + (titular != null ? titular.getNombre() : "null") +
                '}';
    }
}
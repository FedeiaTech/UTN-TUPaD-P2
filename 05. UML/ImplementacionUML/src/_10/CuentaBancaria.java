package _10;

import java.util.Date;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    // Composición: la CuentaBancaria contiene la ClaveSeguridad
    private ClaveSeguridad clave;
    // Asociación bidireccional: la CuentaBancaria tiene un Titular
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, Date fechaClave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        // La ClaveSeguridad se crea dentro del constructor de CuentaBancaria (composición)
        this.clave = new ClaveSeguridad(codigoClave, fechaClave);
        // Se recibe el objeto Titular
        this.titular = titular;
        // Se establece la relación bidireccional en el objeto Titular
        this.titular.setCuenta(this);
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

    public ClaveSeguridad getClave() {
        return clave;
    }
    
    // En composición, no se suele tener un setter para el objeto contenido

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "cbu='" + cbu + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.pago.implemetaciones;

import ecommerce.pago.interfaces.Pago;
import ecommerce.pago.interfaces.PagoConDescuento;

public class PayPal implements Pago, PagoConDescuento {
    private double descuento = 0;

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuento = porcentaje;
        System.out.println("Descuento PayPal aplicado: " + porcentaje + "%");
    }

    @Override
    public void procesarPago(double monto) {
        double montoFinal = monto - (monto * (descuento / 100.0));
        System.out.println("Procesando pago de $" + montoFinal + " con PayPal (descuento aplicado).");
    }
}
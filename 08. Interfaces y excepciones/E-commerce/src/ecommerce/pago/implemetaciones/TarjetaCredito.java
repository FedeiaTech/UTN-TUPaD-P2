/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.pago.implemetaciones;

import ecommerce.pago.interfaces.Pago;

public class TarjetaCredito implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito.");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import ecommerce.modelo.Cliente;
import ecommerce.modelo.Pedido;
import ecommerce.modelo.Producto;
import ecommerce.pago.implemetaciones.PayPal;
import ecommerce.pago.implemetaciones.TarjetaCredito;

public class ECommerceDemo {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Perez");
        Pedido pedido1 = new Pedido(cliente1);

        pedido1.agregarProducto(new Producto("Laptop Gamer", 1200.50));
        pedido1.agregarProducto(new Producto("Teclado Mecánico", 150.00));

        double totalPedido = pedido1.calcularTotal();
        System.out.println("Total del pedido: $" + totalPedido);
        
        pedido1.setEstado("Enviado");
        
        System.out.println("\n--- Procesando Pagos ---");
        
        TarjetaCredito tc = new TarjetaCredito();
        tc.procesarPago(totalPedido);

        PayPal pp = new PayPal();
        pp.aplicarDescuento(10); // 10% de descuento
        pp.procesarPago(totalPedido);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.modelo;

import ecommerce.interfaces.Notificable;
import ecommerce.interfaces.Pagable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Notificable cliente;

    public Pedido(Notificable cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "Pendiente";
        notificarCliente("Pedido creado. Estado: " + this.estado);
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarCliente("El estado de su pedido cambió a: " + this.estado);
    }

    private void notificarCliente(String mensaje) {
        if (this.cliente != null) {
            this.cliente.notificar(mensaje);
        }
    }
}
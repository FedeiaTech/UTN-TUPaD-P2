/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaDeStock;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // --- Métodos Requeridos ---

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado al inventario.");
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        System.out.println("\n===== LISTADO DE PRODUCTOS EN INVENTARIO =====");
        for (Producto p : this.productos) { // Uso de for-each
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; // No encontrado
    }

    public void eliminarProducto(String id) {
        Producto pEliminar = buscarProductoPorId(id);
        if (pEliminar != null) {
            this.productos.remove(pEliminar);
            System.out.println("Producto '" + pEliminar.getNombre() + "' (ID: " + id + ") eliminado.");
        } else {
            System.out.println("No se pudo eliminar: Producto con ID " + id + " no encontrado.");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto pActualizar = buscarProductoPorId(id);
        if (pActualizar != null) {
            pActualizar.setCantidad(nuevaCantidad);
            System.out.println("Stock de '" + pActualizar.getNombre() + "' actualizado a " + nuevaCantidad + ".");
        } else {
            System.out.println("No se pudo actualizar: Producto con ID " + id + " no encontrado.");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n===== PRODUCTOS DE LA CATEGORÍA: " + categoria + " =====");
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en esta categoría.");
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : this.productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        
        Producto mayorStock = productos.get(0);
        for (Producto p : this.productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n===== PRODUCTOS CON PRECIO ENTRE $" + min + " y $" + max + " =====");
        boolean encontrados = false;
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
                encontrados = true;
            }
        }
        if (!encontrados) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
    }

    public void mostrarCategoriasDisponibles() { // El método está listado junto a filtrarPorPrecio
        System.out.println("\n===== CATEGORÍAS DISPONIBLES =====");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name() + ": " + cat.getDescripcion());
        }
    }
}
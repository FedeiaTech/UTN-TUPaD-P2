/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SistemaDeStock;

public class MainStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        System.out.println("--- Tarea 1: Crear y agregar 5 productos ---");
        inventario.agregarProducto(new Producto("A001", "Laptop Gamer", 2500.0, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A002", "Arroz Integral", 150.0, 100, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("A003", "Camiseta Blanca", 1800.0, 50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("A004", "Smart TV 55\"", 3000.0, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("A005", "Juego de Sábanas", 2200.0, 20, CategoriaProducto.HOGAR));

        System.out.println("\n--- Tarea 2: Listar todos los productos ---");
        inventario.listarProductos();

        System.out.println("\n--- Tarea 3: Buscar producto por ID (A003) ---");
        Producto pBuscado = inventario.buscarProductoPorId("A003");
        if (pBuscado != null) {
            pBuscado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("\n--- Tarea 4: Filtrar por categoría (ELECTRONICA) ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\n--- Tarea 5: Eliminar producto (A002) y listar restantes ---");
        inventario.eliminarProducto("A002");
        inventario.listarProductos();

        System.out.println("\n--- Tarea 6: Actualizar stock (A001 a 15) ---");
        inventario.actualizarStock("A001", 15);
        Producto pActualizado = inventario.buscarProductoPorId("A001");
        if (pActualizado != null) {
            pActualizado.mostrarInfo();
        }

        System.out.println("\n--- Tarea 7: Mostrar total de stock disponible ---");
        System.out.println("El stock total de todos los productos es: " + inventario.obtenerTotalStock());

        System.out.println("\n--- Tarea 8: Mostrar producto con mayor stock ---");
        Producto pMayorStock = inventario.obtenerProductoConMayorStock();
        if (pMayorStock != null) {
            System.out.println("El producto con mayor stock es: " + pMayorStock.getNombre());
            pMayorStock.mostrarInfo();
        }

        System.out.println("\n--- Tarea 9: Filtrar productos entre $1000 y $3000 ---");
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);

        System.out.println("\n--- Tarea 10: Mostrar categorías disponibles ---");
        inventario.mostrarCategoriasDisponibles();
    }
}
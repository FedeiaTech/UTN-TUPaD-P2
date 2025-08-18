import java.util.Scanner;

/**
 * Clase principal que unifica varios ejercicios prácticos de Java.
 *
 * @autor FEDERICO iACONO
 */
public class TrabajoPractico {

    // Declaramos un único objeto Scanner como estático para que todos los métodos
    // de la clase puedan compartirlo sin necesidad de crearlo múltiples veces.
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.print("Seleccione un ejercicio: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1_verificarAnioBisiesto();
                    break;
                case 2:
                    ejercicio2_mayorDeTres();
                    break;
                case 3:
                    ejercicio3_clasificacionEdad();
                    break;
                case 4:
                    ejercicio4_calculadoraDescuento();
                    break;
                case 5:
                    ejercicio5_sumaParesWhile();
                    break;
                case 6:
                    ejercicio6_contadorNumeros();
                    break;
                case 7:
                    ejercicio7_validacionNota();
                    break;
                case 8:
                    ejercicio8_calculadoraPrecioFinal();
                    break;
                case 9:
                    ejercicio9_calculadoraCompra();
                    break;
                case 10:
                    ejercicio10_gestionStock();
                    break;
                case 11:
                    ejercicio11_calculadoraDescuentoEspecial();
                    break;
                case 12:
                    ejercicio12_modificarArray();
                    break;
                case 13:
                    ejercicio13_arrayRecursivo();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);
    }

    // MÉTODOS 

    //Ejercicio 1: Pide un año y determina si es bisiesto
    public static void ejercicio1_verificarAnioBisiesto() {
        System.out.println("\n--- Ejercicio 1: Verificación de Año Bisiesto ---");
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    // Ejercicio 2: Pide tres números y determina cuál es el mayor
    public static void ejercicio2_mayorDeTres() {
        System.out.println("\n--- Ejercicio 2: Determinar el Mayor de Tres Números ---");
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El mayor es: " + mayor);
    }

    //Ejercicio 3: Pide una edad y la clasifica en categorías
    public static void ejercicio3_clasificacionEdad() {
        System.out.println("\n--- Ejercicio 3: Clasificación de Edad ---");
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }

    //Ejercicio 4: Calcula el descuento de un producto según su categoría
    public static void ejercicio4_calculadoraDescuento() {
        System.out.println("\n--- Ejercicio 4: Calculadora de Descuento según categoría ---");
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.next();
        double porcentajeDescuento = 0.0;
        if (categoria.equalsIgnoreCase("A")) {
            porcentajeDescuento = 0.10; // 10%
        } else if (categoria.equalsIgnoreCase("B")) {
            porcentajeDescuento = 0.15; // 15%
        } else if (categoria.equalsIgnoreCase("C")) {
            porcentajeDescuento = 0.20; // 20%
        } else {
            System.out.println("Categoría no válida. No se aplicará descuento.");
        }
        double descuento = precioOriginal * porcentajeDescuento;
        double precioFinal = precioOriginal - descuento;
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Descuento aplicado: " + (int)(porcentajeDescuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    //Ejercicio 5: Suma números pares ingresados por el usuario hasta que se ingrese 0
    public static void ejercicio5_sumaParesWhile() {
        System.out.println("\n--- Ejercicio 5: Suma de Números Pares (while) ---");
        int sumaPares = 0;
        int numero;
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = scanner.nextInt();
        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
    }

    //Ejercicio 6: Pide 10 números y cuenta cuántos son positivos, negativos o cero
    public static void ejercicio6_contadorNumeros() {
        System.out.println("\n--- Ejercicio 6: Contador de Positivos, Negativos y Ceros (for) ---");
        int positivos = 0, negativos = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    //Ejercicio 7: Pide una nota hasta que esté en el rango válido (0-10)
    public static void ejercicio7_validacionNota() {
        System.out.println("\n--- Ejercicio 7: Validación de Nota entre 0 y 10 (do-while) ---");
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }

    //Ejercicio 8: Pide precio base, impuesto y descuento para calcular el precio final
    public static void ejercicio8_calculadoraPrecioFinal() {
        System.out.println("\n--- Ejercicio 8: Cálculo del Precio Final con Impuesto y Descuento ---");
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        double impuesto = scanner.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        double descuento = scanner.nextDouble();
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    // Método auxiliar para el ejercicio 8
    private static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestoDecimal = impuesto / 100;
        double descuentoDecimal = descuento / 100;
        return precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
    }

    //Ejercicio 9: Calcula el costo de envío y el total de una compra
    public static void ejercicio9_calculadoraCompra() {
        System.out.println("\n--- Ejercicio 9: Composición de Funciones para Calcular Costo de Envío ---");
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.next();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + costoEnvio);
        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar);
    }

    // Métodos auxiliares para el ejercicio 9
    private static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        }
        System.out.println("Zona no válida. El costo de envío se calculará como 0.");
        return 0;
    }
    
    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }


    //Ejercicio 10: Actualiza el stock de un producto a partir de ventas y recepciones
    public static void ejercicio10_gestionStock() {
        System.out.println("\n--- Ejercicio 10: Actualización de Stock ---");
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
    
    // Método auxiliar para el ejercicio 10
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }


    //Ejercicio 11: Calcula un descuento especial usando una variable de clase
        // Variable "global" (de clase) para el descuento especial
    private static final double DESCUENTO_ESPECIAL = 0.10;

    public static void ejercicio11_calculadoraDescuentoEspecial() {
        System.out.println("\n--- Ejercicio 11: Cálculo de Descuento Especial ---");
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        
        // El cálculo se hace dentro de este método para mostrar el uso de la variable de clase
        double descuentoAplicado = precioProducto * DESCUENTO_ESPECIAL;
        double precioFinal = precioProducto - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado (" + (DESCUENTO_ESPECIAL*100) + "%) es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    // Ejercicio 12: Declara, muestra, modifica y vuelve a mostrar un array de precios
    public static void ejercicio12_modificarArray() {
        System.out.println("\n--- Ejercicio 12: Modificación de un array de precios ---");
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};

        System.out.println("Precios originales:");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        
        // Modificamos el precio del tercer producto (índice 2)
        precios[2] = 129.99;
        
        System.out.println("\nPrecios modificados (el tercer precio cambió a 129.99):");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }

    // Ejercicio 13: Utiliza una función recursiva para imprimir un array
    public static void ejercicio13_arrayRecursivo() {
        System.out.println("\n--- Ejercicio 13: Impresión Recursiva de Arrays ---");
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
        
        System.out.println("Precios originales (impresión recursiva):");
        imprimirArrayRecursivo(precios, 0); // Primera llamada
        
        precios[2] = 129.99; // Modificación
        
        System.out.println("\nPrecios modificados (impresión recursiva):");
        imprimirArrayRecursivo(precios, 0); // Segunda llamada
    }

    // Método recursivo auxiliar para el ejercicio 13
    private static void imprimirArrayRecursivo(double[] array, int indice) {
        // Caso base: si el índice es igual o mayor ala longitud del array la recursión termina
        if (indice >= array.length) {
            return;
        }
        // Imprime el elemento actual
        System.out.println("Precio: $" + array[indice]);
        // Llamada recursiva para el siguiente elemento
        imprimirArrayRecursivo(array, indice + 1);
    }
}
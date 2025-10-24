/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import excepciones.custom.EdadInvalidaException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2.1 División segura
        System.out.println("--- 2.1 División Segura ---");
        divisionSegura(scanner);

        // 2.2 Conversión de cadena a número
        System.out.println("\n--- 2.2 Conversión de Cadena ---");
        conversionCadena(scanner);

        // 2.3 Lectura de archivo
        System.out.println("\n--- 2.3 Lectura de Archivo (Error esperado) ---");
        lecturaArchivoSimple("archivo_inexistente.txt");

        // 2.4 Excepción personalizada
        System.out.println("\n--- 2.4 Excepción Personalizada ---");
        pruebaEdad();
        
        // 2.5 Uso de try-with-resources
        System.out.println("\n--- 2.5 Try-with-resources ---");
        System.out.println("(Asegúrese de crear un 'datos.txt' para la prueba)");
        lecturaConTryWithResources("datos.txt");
        
        scanner.close();
    }

    // 2.1 División Segura
    public static void divisionSegura(Scanner scanner) {
        try {
            System.out.print("Ingrese el dividendo (entero): ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor (entero): ");
            int divisor = scanner.nextInt();

            double resultado = (double) dividendo / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números enteros.");
        }
        scanner.nextLine(); // Limpiar buffer
    }

    // 2.2 Conversión de Cadena
    public static void conversionCadena(Scanner scanner) {
        System.out.print("Ingrese un texto para convertir a número: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El número es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto '" + texto + "' no se puede convertir a entero.");
        }
    }

    // 2.3 Lectura de Archivo
    public static void lecturaArchivoSimple(String nombreArchivo) {
        try {
            File archivo = new File(nombreArchivo);
            Scanner lectorArchivo = new Scanner(archivo);
            
            System.out.println("Contenido de " + nombreArchivo + ":");
            while (lectorArchivo.hasNextLine()) {
                System.out.println(lectorArchivo.nextLine());
            }
            lectorArchivo.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado (" + e.getMessage() + ")");
        }
    }

    // 2.4 Método que lanza la excepción personalizada
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
        }
        System.out.println("Edad válida registrada: " + edad);
    }

    // 2.4 Método que prueba la captura
    public static void pruebaEdad() {
        try {
            validarEdad(30);
            validarEdad(150); // Esta línea lanzará la excepción
            validarEdad(-5);  // Esta línea no se ejecutará
        } catch (EdadInvalidaException e) {
            System.out.println("Error de validación: " + e.getMessage());
        }
    }

    // 2.5 Uso de try-with-resources
    public static void lecturaConTryWithResources(String nombreArchivo) {
        
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido de " + nombreArchivo + ":");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + nombreArchivo + "' no fue encontrado.");
        } catch (IOException e) {
            System.out.println("Error de E/S (IOException) al leer el archivo: " + e.getMessage());
        }
    }
}
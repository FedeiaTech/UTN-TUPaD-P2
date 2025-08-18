package trabajopracticobasico;
import java.util.Scanner;

/**
  * @autor Federico Iacono
 */
public class TrabajoPracticoBasico {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("║          MENÚ DE EJERCICIOS BÁSICOS");
            System.out.println("");
            System.out.println("║ 2. Programa 'Hola Mundo'                    ");
            System.out.println("║ 3. Declarar e imprimir variables            ");
            System.out.println("║ 4. Solicitar nombre y edad al usuario       ");
            System.out.println("║ 5. Operaciones con dos números              ");
            System.out.println("║ 6. Mensaje con caracteres de escape         ");
            System.out.println("║ 7. Explicación: Expresiones vs Instrucciones");
            System.out.println("║ 8. Explicación: División con int vs double  ");
            System.out.println("║ 9. Demostración: Corregir error de Scanner  ");
            System.out.println("║ 10. Demostración: Prueba de escritorio      ");
            System.out.println("║ 0. Salir                                    ");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

           switch (opcion) {
                case 2:
                    ejercicio2_holaMundo();
                    break;
                case 3:
                    ejercicio3_datosPersonales();
                    break;
                case 4:
                    ejercicio4_datosUsuario();
                    break;
                case 5:
                    ejercicio5_operaciones();
                    break;
                case 6:
                    ejercicio6_mensajeConEscape();
                    break;
                case 7:
                    ejercicio7_explicacionExpresionInstruccion();
                    break;
                case 8:
                    ejercicio8_divisionEnterosVsDecimales();
                    break;
                case 9:
                    ejercicio9_corregirErrorScanner();
                    break;
                case 10:
                    ejercicio10_pruebaDeEscritorio();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 0);
    }

    // MÉTODOS --

    public static void ejercicio2_holaMundo() {
        System.out.println("\n--- Ejercicio 2: Hola Mundo ---");
        System.out.println("¡Hola, Java!");
    }

    public static void ejercicio3_datosPersonales() {
        System.out.println("\n--- Ejercicio 3: Declarar e Imprimir Variables ---");
        String nombre = "Ana";
        int edad = 25;
        double altura = 1.68;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("¿Es estudiante?: " + estudiante);
    }

    public static void ejercicio4_datosUsuario() {
        System.out.println("\n--- Ejercicio 4: Solicitar Nombre y Edad al Usuario --");

        scanner.nextLine();

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }

    // 5
    public static void ejercicio5_operaciones() {
        System.out.println("\n-- Ejercicio 5: Operaciones con Dos Números ---");
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        if (num2 != 0) {
            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Resta: " + (num1 - num2));
            System.out.println("Multiplicación: " + (num1 * num2));
            System.out.println("División Entera: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

    public static void ejercicio6_mensajeConEscape() {
        System.out.println("\n-- Ejercicio 6: Mensaje con Caracteres de Escape ---");
        System.out.println("Nombre: Juan Pérez\nEdad: 30 años\nDirección: \"Calle Falsa 123\"");
    }

    public static void ejercicio7_explicacionExpresionInstruccion() {
        System.out.println("\n-- Ejercicio 7: Explicación de Expresiones vs. Instrucciones ---");
        System.out.println("Una EXPRESIÓN es una combinación de valores, variables y operadores que produce un valor.");
        System.out.println("Ejemplos de expresiones: 10, x + 5\n");
        System.out.println("Una INSTRUCCIÓN es una acción completa que el programa ejecuta.");
        System.out.println("Ejemplos de instrucciones: int x = 10;, System.out.println(x);\n");
        System.out.println("--- Ejecutando código de ejemplo ---");
        int x = 10;
        System.out.println("Código: int x = 10;");
        x = x + 5;
        System.out.println("Código: x = x + 5;");
        System.out.println("El valor final de x es: " + x);
    }

    public static void ejercicio8_divisionEnterosVsDecimales() {
        System.out.println("\n--- Ejercicio 8: División con int vs double ---");
        System.out.println("\nParte 1: División con Enteros (int)");
        System.out.print("Ingresa el primer número entero (ej. 7): ");
        int a = scanner.nextInt();
        System.out.print("Ingresa el segundo número entero (ej. 2): ");
        int b = scanner.nextInt();
        System.out.println("Resultado de " + a + " / " + b + " (int): " + (a / b) + " (se descartan decimales)");

        System.out.println("\nParte 2: División con Decimales (double)");
        System.out.print("Ingresa el primer número decimal (ej. 7.0): ");
        double c = scanner.nextDouble();
        System.out.print("Ingresa el segundo número decimal (ej. 2.0): ");
        double d = scanner.nextDouble();
        System.out.println("Resultado de " + c + " / " + d + " (double): " + (c / d) + " (se conservan decimales)");
    }

    public static void ejercicio9_corregirErrorScanner() {
        System.out.println("\n--- Ejercicio 9: Corregir Código con Scanner ---");
        System.out.println("Error común: tratar de leer texto (String) con scanner.nextInt().");
        System.out.println("Solución: Usar el método correcto, que es scanner.nextLine().\n");
        System.out.println("--- Ejecutando el código corregido ---");
        scanner.nextLine();
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    }

    public static void ejercicio10_pruebaDeEscritorio() {
        System.out.println("\n--- Ejercicio 10: Prueba de Escritorio ---");
        System.out.println("Código a analizar:");
        System.out.println("int a = 5;");
        System.out.println("int b = 2;");
        System.out.println("int resultado = a / b;");
        System.out.println("System.out.println(\"Resultado: \" + resultado);\n");

        System.out.println("Prueba de escritorio paso a paso:");
        System.out.println("1. Variable 'a' se inicializa con el valor 5");
        System.out.println("2. Variable 'b' se inicializa con el valor 2");
        System.out.println("3. Se calcula 'a / b' (5 / 2). Como es división entera, el resultado es 2");
        System.out.println("4. La variable 'resultado' se inicializa con 2");
        System.out.println("5. Se imprime el valor de 'resultado'.\n");

        System.out.println("--- Salida final del programa ---");
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }
}
package trabajopracticopoo;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributo estático
    private static int totalEmpleados = 0;

    // Constructor
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor sobrecargado - solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        // Asigna un ID automático
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        // Salario por defecto
        this.salario = 1500.0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    
    // Método sobrecargado para aumentar salario por porcentaje
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }

    // Método sobrecargado para aumentar salario por valor
    public void actualizarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }

    //toString estado de empleado
    @Override
    public String toString() {
        return "ID: " + this.id + ", Nombre: " + this.nombre + ", Puesto: " + this.puesto + ", Salario: $" + String.format("%.2f", this.salario);
    }

    // Método estático para el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
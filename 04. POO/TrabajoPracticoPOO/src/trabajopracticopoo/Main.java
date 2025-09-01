package trabajopracticopoo;

public class Main {
    public static void main(String[] args) {
        // Usando el constructor con todos los atributos
        System.out.println("Empleados");
        Empleado emp1 = new Empleado(101, "Claudio Saravia", "Desarrollador web", 3000.0);
        System.out.println(emp1);

        // Empleado usando el constructor sobrecargado
        Empleado emp2 = new Empleado("Anita López", "Gerente");
        System.out.println(emp2);

        //Otroempleado con el constructor sobrecargado
        Empleado emp3 = new Empleado("Luisa Cerne", "Analista de datos");
        System.out.println(emp3);

        System.out.println("\nAumento de salarios");
        // Aumentar salario de emp1 por porcentaje
        emp1.actualizarSalario(10.0);
        System.out.println("Salario de "+ emp1.getNombre() + " actualizado (+10%):");
        System.out.println(emp1);

        // Aumentar salario de emp2 por valor fijoo
        emp2.actualizarSalario(500);
        System.out.println("Salario de "+ emp2.getNombre() + " actualizado (+$500):");
        System.out.println(emp2);

        // Mostrar el total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

import java.util.ArrayList;
import java.util.List;

public class MainEmpleados {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 30000, 5000));
        empleados.add(new EmpleadoTemporal("Luis", 80, 400));
        empleados.add(new EmpleadoPlanta("Carlos", 32000, 4000));

        for (Empleado emp : empleados) {
            System.out.println("Empleado: " + emp.getNombre());
            System.out.println("Sueldo: " + emp.calcularSueldo());

            if (emp instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }
            System.out.println("--------------------");
        }
    }
}
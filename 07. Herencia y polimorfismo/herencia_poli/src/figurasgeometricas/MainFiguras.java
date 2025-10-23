/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[2];
        
        figuras[0] = new Circulo("Círculo 1", 10.0);
        figuras[1] = new Rectangulo("Rectángulo 1", 5.0, 8.0);

        for (Figura fig : figuras) {
            System.out.println("Área de " + fig.getNombre() + ": " + fig.calcularArea());
        }
    }
}
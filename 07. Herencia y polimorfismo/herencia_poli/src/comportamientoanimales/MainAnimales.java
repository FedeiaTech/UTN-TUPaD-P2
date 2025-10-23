/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comportamientoanimales;

import java.util.ArrayList;
import java.util.List;

public class MainAnimales {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        animales.add(new Animal());

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
package com.androiddesdecero.collections;

import java.util.Comparator;

/**
 * Created by albertopalomarrobledo on 8/2/19.
 */
/*
Implementamos Comparator para implementar el metodo compare que nos permite comparar dos objetos.
Nos devuelve Positivo Objeto1 > Objeto2
Nos devuelve Cero es que son iguales
Nos devuelve Negativo Objeto1 < Objeto2
 */
public class CompararNombres implements Comparator<Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        /*
        Nos devuelve Positivo animal1 > animal2
        Nos devuelve Cero es que son iguales
        Nos devuelve Negativo animal1 < animal2
         */
        return animal1.getNombre().compareTo(animal2.getNombre());
    }
}

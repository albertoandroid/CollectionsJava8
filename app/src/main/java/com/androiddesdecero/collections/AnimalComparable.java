package com.androiddesdecero.collections;

import android.support.annotation.NonNull;

/**
 * Created by albertopalomarrobledo on 8/2/19.
 */

/*
vamos a implementar la interfaz comparable que nos ayuda a ordenar
 */
public class AnimalComparable implements Comparable<AnimalComparable>{

    private int id;
    private String nombre;

    public AnimalComparable(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(AnimalComparable animal) {
        /*
        Esto nos ordena los elementos.
         */
        return this.id - animal.getId();

        /*
        ordenar por nombre
         */
        //return this.nombre.compareTo(animal.getNombre());

    }
}

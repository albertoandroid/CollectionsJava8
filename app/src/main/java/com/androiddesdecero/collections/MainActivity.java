package com.androiddesdecero.collections;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    La clase Collections de Java 8 nos ofrece todo lo que queriamos a la hora de trabajar con
    listas y hasta la fecha teniamos que utilizar algoritmos de ordenación como la burbuja y demás metodos.
    Pero Collections hace el trabajo duro por nosotros.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ordenarNumeros();
        //ordenarPalabras();
        //ordenarClaseAnimales();
        ordenarComparable();
    }

    private void ordenarComparable(){
        List<AnimalComparable> lista = new ArrayList<>();
        lista.add(new AnimalComparable(1, "Zorro"));
        lista.add(new AnimalComparable(10, "Gato"));
        lista.add(new AnimalComparable(3, "Perro"));
        lista.add(new AnimalComparable(20, "Burro"));
        lista.add(new AnimalComparable(5, "Cabra"));

        Collections.sort(lista);
        for(AnimalComparable animal : lista){
            Log.d("TAG1", "orden: " + animal.getId());
        }
        Log.d("TAG1", "--------------- ---------------");

    }

    private void ordenarClaseAnimales(){
        List<Animal> lista = new ArrayList<>();
        lista.add(new Animal(1, "Zorro"));
        lista.add(new Animal(10, "Gato"));
        lista.add(new Animal(3, "Perro"));
        lista.add(new Animal(20, "Burro"));
        lista.add(new Animal(5, "Cabra"));

        /*
        En este caso collection no sabe como ordenar, y por ello hay que pasarle
        el termino de comparación, ejemplo por id, por nombre, por numero de patas. etc.
        Collections.sort(lista);
        Necesitamos la interfaz comprator
        Metodo 1 -> Creando clase Comprar Nombres
         */
        Collections.sort(lista, new CompararNombres());
        for(Animal animal : lista){
            Log.d("TAG1", "orden: " + animal.getNombre());
        }
        Log.d("TAG1", "--------------- ---------------");

        /*
        Metodo2 implementando la interaz
         */
        Collections.sort(lista, new Comparator<Animal>() {
            @Override
            public int compare(Animal animal, Animal t1) {
                int respuesta = 0;
                if (animal.getId() > t1.getId()) {
                    respuesta = 1;
                } else if (animal.getId() < t1.getId()) {
                    respuesta = -1;
                }
                return respuesta;
            }
        });
        for(Animal animal : lista){
            Log.d("TAG1", "orden: " + animal.getId());
        }
        Log.d("TAG1", "--------------- ---------------");

    }

    private void ordenarPalabras(){
        List<String> lista = new ArrayList<>();
        lista.add("Leon");
        lista.add("Cebra");
        lista.add("Zorro");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Elefante");
        for(String animal : lista){
            Log.d("TAG1", "orden: " + animal);
        }
        Log.d("TAG1", "--------------- ---------------");

        /*
        sort ordena una lista por letras o alfabeticamente
         */
        Collections.sort(lista);
        for(String animal : lista){
            Log.d("TAG1", "orden: " + animal);
        }
        Log.d("TAG1", "--------------- ---------------");

        /*
        reverse ordena en orden inverso
         */
        Collections.reverse(lista);
        for(String animal : lista){
            Log.d("TAG1", "orden: " + animal);
        }
        Log.d("TAG1", "--------------- ---------------");
    }

    private void ordenarNumeros(){
        List<Integer> lista = new ArrayList<>();
        lista.add(22);
        lista.add(12);
        lista.add(22);
        lista.add(55);
        lista.add(23);
        for(Integer numero : lista){
            Log.d("TAG1", "orden: " + numero);
        }
        Log.d("TAG1", "--------------- ---------------");

        Collections.sort(lista);
        for(Integer numero : lista){
            Log.d("TAG1", "orden: " + numero);
        }
        Log.d("TAG1", "--------------- ---------------");

        Collections.reverse(lista);
        for(Integer numero : lista){
            Log.d("TAG1", "orden: " + numero);
        }
    }
}

package com.wjnnovoa.arreglos;

import java.util.Arrays;
import java.util.Collections;

public class EjemploIterarArreglosInversoForMutable {

    public static void arregloInverso(String[] arreglo){
        //MODIFICANDO EL ARREGLO EN REVERSO
        int total = arreglo.length;
        for (int i = 0; i < total/2; i++) {
            String actual = arreglo[i];
            String inverso  = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i]= actual;
        }
    }

    public static void main(String[] args) {

        String[] productos = new String[7];

        //Cuando no se le asigna un valor, el mismo java lo pone como null

        productos[0] = "Kingston Pendrive";
        productos[1] = "Mouse";
        productos[2] = "Pantalla";
        productos[3] = "Portatil";
        productos[4] = "PC gamer";
        productos[5] = "Control";
        productos[6] = "Cargador";

        //Ordenar de forma alfabetica con sort
        Arrays.sort(productos);

        int total = productos.length;
        //USANDO UN FOR
        System.out.println(" ######## ITERANDO ARREGLO DE FORMA NORMAL ########");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }

        arregloInverso(productos);

        //Otra forma de volver un arreglo inverso es con collection
        //Collections.reverse(Arrays.asList(productos));

        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }
        



    }
}

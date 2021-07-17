package com.wjnnovoa.arreglos;

import java.util.Arrays;
import java.util.Random;

public class EjemploIterarArreglos {
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
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }

        //USANDO FOREACH
        for (String prod : productos) {
            System.out.println("prod = " + prod);
        }

        //USANDO UN WHILE
        int j = 0;
        while (j < total) {
            System.out.println("Para el indice " + j + " : " + productos[j]);
            j++;
        }

        int[] numeros = new int[4];

        int countNumeros = numeros.length;
        for (int i = 0; i < countNumeros; i++) {
            //Agregando numeros aleatorios
            numeros[i] = (int) Math.round(10 *  Math.random());
            System.out.println("numeros[i] = " + numeros[i]);
        }

    }
}

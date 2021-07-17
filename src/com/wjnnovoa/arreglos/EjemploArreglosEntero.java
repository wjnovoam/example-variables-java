package com.wjnnovoa.arreglos;

import java.util.Arrays;

public class EjemploArreglosEntero {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];
        //No se debe tratar de asiganar mas de la cantidad maxima

        //Obtener el ultimo elemento del arreglo
        int ultimo = numeros[numeros.length - 1];

        //Ordenar de forma alfabetica con sort
        Arrays.sort(numeros);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("ultimo = " + ultimo);
    }
}

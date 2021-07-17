package com.wjnnovoa.arreglos;

import java.util.Arrays;

public class EjemploIterarArreglosInversoFor {
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

        //ITERANDO ARREGLO DE FORMA INVERS
        System.out.println(" ######## ITERANDO ARREGLO DE FORMA INVERSA ########");
        for (int i = 0; i < total; i++) {
            System.out.println("Para el indice " + (total-1-i) + " : " + productos[total-1-i]);
        }

        System.out.println(" ######## OTRO METODO DE ITERANDO ARREGLO DE FORMA INVERSA ########");
        for (int i = total -1; i >= 0; i--) {
            System.out.println("Para el indice " + i + " : " + productos[i]);
        }



    }
}

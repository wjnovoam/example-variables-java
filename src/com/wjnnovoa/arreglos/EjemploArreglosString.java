package com.wjnnovoa.arreglos;

import java.util.Arrays;

public class EjemploArreglosString {
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

        String prod1 = productos[0];

        System.out.println("prod1 = " + prod1);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);


    }
}

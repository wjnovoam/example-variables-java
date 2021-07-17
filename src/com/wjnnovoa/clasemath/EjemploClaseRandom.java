package com.wjnnovoa.clasemath;

import java.util.Random;

public class EjemploClaseRandom {
    public static void main(String[] args) {

        //Podemos generar decimales, enteros de  forma automatica
        Random randomObj = new Random();
        System.out.println("randomObj = " + randomObj);

        //Generar numeros enteros
        int ramdomInt = randomObj.nextInt(7);
        System.out.println("ramdomInt = " + ramdomInt);

        //generar numeros double
        double randomDouble = randomObj.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        //Generar numero enterero desde 15 hasta 25
        int randomInt2 = 15 + randomObj.nextInt(25-15);
        System.out.println("randomInt2 = " + randomInt2);
    }
}

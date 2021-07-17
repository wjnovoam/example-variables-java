package com.wjnnovoa.clasemath;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String [] colores = {"azul", "amarillo", "rojo", "verde", "morado", "gris"};

        //Generar un numero aleatorio
        double random = Math.random();
        System.out.println("random = " + random);

        //NUMERO ALEATORIO DEL UNO AL 7
        random *= colores.length;
        System.out.println("random = " + Math.round(random));

        System.out.println("colores = " + colores[(int) Math.floor(random)]);
    }
}

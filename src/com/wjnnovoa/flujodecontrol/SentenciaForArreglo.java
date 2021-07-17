package com.wjnnovoa.flujodecontrol;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombres = {"William", "Johan", "Novoa", "Melendrez"};

        int count = nombres.length; //Esto aca para no calcular siempre el .length
        for(int i = 0; i < count; i++) {
            System.out.println("nombres = " + nombres[i]);
        }
    }
}

package com.wjnnovoa.string;

import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        //VALIDACION DE NULL
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso =""; //"Programacion Java";
        }

        //VALIDACCION .LENGTH()
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        //VALIDACION isEmpty();
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        //VALIDACION isBlank()
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(!esVacio){
            System.out.println(curso.toUpperCase());
            System.out.println(curso.concat(" desde cero"));
        }




    }
}

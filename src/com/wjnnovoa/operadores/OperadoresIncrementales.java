package com.wjnnovoa.operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //PRE INCREMENTO
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //POST INCREMENTO
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //PRE DECREMENTO
        i = 3;
        j = --i;
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        //POST DECREMENTO
        i = 4;
        System.out.println("inicial de i = " + i);
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);



    }
}

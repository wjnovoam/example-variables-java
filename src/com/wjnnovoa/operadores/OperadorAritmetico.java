package com.wjnnovoa.operadores;

public class OperadorAritmetico {
    public static void main(String[] args) {

        //SUMA
        int i = 5, j= 4, suma = i +j;
        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j));

        //RESTA
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("(i -j) = " + (i -j));

        //MULTIPLICACION
        int multi = i * j;
        System.out.println("multiplicacion = " + multi);

        //DIVISION
        int divi = i / j;
        float divi2 = (float) i / (float) j;
        System.out.println("division entero = " + divi);
        System.out.println("division2 float = " + divi2);

        //RESTO O MODULO
        int resto = i % j;
        System.out.println("resto = " + resto);
    }
}

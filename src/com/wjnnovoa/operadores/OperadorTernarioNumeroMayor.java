package com.wjnnovoa.operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 =  sc.nextInt();

        System.out.println("Ingrese un segundo numero");
        int num2 =  sc.nextInt();

        System.out.println("Ingrese un tercer numero");
        int num3 =  sc.nextInt();

        max = (num1 > num2)? num1: num2;
        max = (max > num3)? max: num3;


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("max = " + max);
    }
}

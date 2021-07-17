package com.wjnnovoa.operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        //IGUAL IGUAL ==
        boolean b1 = i == j;
        System.out.println("b1 = i == j = " + b1);

        //NEGACION
        boolean b2 = !b1;
        System.out.println("b2 = !b1 = " + b2);

        //DISTINTO
        boolean b3 = i != j;
        System.out.println("b3 = i != j " + b3);

        //COMPARAR BOOLEANOS
        boolean b4 = m == true;
        System.out.println("b4 = m == true = " + b4);

        //MAYOR QUE
        boolean b5 = i > j;
        System.out.println("b5 =  i > j = " + b5);

        //MENOR QUE
        boolean b6 = j < i;
        System.out.println("b6 = j < i = " + b6);

        //MAYOR O IGUAL
        boolean b7 = l >= k;
        System.out.println("b7 = l >= k = " + b7);

        //MENOR O IGUAL
        boolean b8 = l <= k;
        System.out.println("b8 = l <= k =  " + b8);

    }
}

package com.wjnnovoa.operadores;

public class OperadoresLogicos1 {
    public static void main(String[] args) {
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // AND &&
        boolean b1 = i == j && k > l;
        System.out.println("b1 = i == j && k > l = " + b1);

        // OR ||
        boolean b2 = i == j || k > l;
        System.out.println("b2 = i == j || k > l = " + b2);

        //PRECEDENCIA EN LOS OPERADORES LOGICOS -> LA PRIORIDAD LA LLEVA EL AND SOBRE EL OR
        boolean b3 = i == j || k < l && m == true;
        System.out.println("b3 = i == j || k < l && m =  " + b3);

        boolean b4 = true || true && false;
        System.out.println("b4 = true || true && false = " + b4);

        boolean b5 = true || (false && false) || false;
        System.out.println("b5 = true || (false && false) || false = " + b5);
    }
}

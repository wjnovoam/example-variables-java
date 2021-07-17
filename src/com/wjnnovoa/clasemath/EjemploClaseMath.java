package com.wjnnovoa.clasemath;

public class EjemploClaseMath {
    public static void main(String[] args) {

        //Valor absoluto de un entero
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        //Maximo entre dos numeros enteros
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        //Minimo entre dos numeros
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        //Redondear un numero hacia arriba
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        //Redondear un numero hacia abajo
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        //Redondear un numero
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        //Hallar el exponencial
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        //funcion logaritmo natural
        double log = Math.log(10);
        System.out.println("log = " + log);

        //Elevar un numero a la Potencia
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        //Raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        //Convertir de radianes a grados
        double grados  =Math.toDegrees(1.57);
        System.out.println("Convertir de radianes a grados = " + grados);

        //Convertir de grados a radianes
        double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " + radianes);
        
        //Seno
        System.out.println("sin(90) = " + Math.sin(radianes));

        //Coseno
        System.out.println("cos(90) = " + Math.cos(radianes));

    }
}

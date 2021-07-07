package com.wjnnovoa.primitivos;

public class ConversionDeTipos {
    public static void main(String[] args) {

        //CONVERSION DE STRING A TIPOS PRIMITIVOS

        String numerosStr = "50";
        int numeroInt = Integer.parseInt(numerosStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "353.45";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBolean = " + logicoBolean);

        //CONVERSION DE TIPOS PRIMITIVOS A STRING

        int otroNumeroInt = 200;
        String otroNumeroString = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroInt = " + otroNumeroString);

        //valueOf recibe cualquier tipo de numero
        otroNumeroString = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroString = " + otroNumeroString);

        double otroRealDouble = 1.23234;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealDouble = " + otroRealStr);

        otroRealStr = String.valueOf(1.34355f);
        System.out.println("otroRealStr = " + otroRealStr);

        //CONVERSION ENTRE PRIMITIVOS -> caset
        int i = 10000;
        short s = (short) i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        char b = (char) i;
        System.out.println("b = " + b);

    }
}

package com.wjnnovoa.primitivos;

public class PrimitivosNumericosEnteros {
    public static void main(String[] args) {
        //NUMEROS ENTEROS

        //Entre -128 a 127
        byte enteroByte = 127;
        System.out.println("enteroByte = " + enteroByte);
        System.out.println("Tipo byte corresponde en byte a "+ Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a "+ Byte.SIZE);
        System.out.println("Valor maximo de un byte "+Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte "+Byte.MIN_VALUE);
        System.out.println("*******************************");

        //Entre -32768 a 32767
        short enteroShort = 32767;
        System.out.println("enteroShort = " + enteroShort);
        System.out.println("Tipo short corresponde en byte a "+ Short.BYTES);
        System.out.println("Tipo short corresponde en bites a "+ Short.SIZE);
        System.out.println("Valor maximo de un short "+Short.MAX_VALUE);
        System.out.println("Valor minimo de un short "+Short.MIN_VALUE);
        System.out.println("*******************************");

        //Entre -2147483648 a 2147483647
        int enteroInt = 2147483647;
        System.out.println("enteroInt = " + enteroInt);
        System.out.println("Tipo int corresponde en byte a "+ Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a "+ Integer.SIZE);
        System.out.println("Valor maximo de un int "+Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int "+Integer.MIN_VALUE);
        System.out.println("*******************************");

        //Entre -9223372036854775808 a 9223372036854775807
        long enteroLong = 9223372036854775807L;
        System.out.println("enteroLong = " + enteroLong);
        System.out.println("Tipo Long corresponde en byte a "+ Long.BYTES);
        System.out.println("Tipo long corresponde en bites a "+ Long.SIZE);
        System.out.println("Valor maximo de un long "+Long.MAX_VALUE);
        System.out.println("Valor minimo de un long "+Long.MIN_VALUE);
    }
}

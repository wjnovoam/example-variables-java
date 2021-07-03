package com.wjnnovoa.primitivos;

public class PrimitivosChar {
    public static void main(String[] args) {
        char caracter = '\u0040'; //El @ en UNICODE
        System.out.println("caracter = " + caracter);
        char decimal = 64; // El @ en numero
        System.out.println("decimal = " + decimal);
        char simbolo =  '@'; // El @ como simbolo normal
        System.out.println("simbolo = " + simbolo);

        System.out.println("Tipo char corresponde en byte a "+ Character.BYTES);
        System.out.println("Tipo char corresponde en bites a "+ Character.SIZE);
        System.out.println("Valor maximo de un char "+Character.MAX_VALUE);
        System.out.println("Valor minimo de un char "+Character.MIN_VALUE);
        System.out.println("*******************************");

        //CARACTERES ESPECIALES
        char espacio = ' ';
        char espacioUnicode = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';




    }
}

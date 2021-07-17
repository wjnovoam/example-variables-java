package com.wjnnovoa.string;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        //Dividir un string en caracteres en un arreglo
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();

        for (char index: arreglo){
            System.out.println("index = " + index);
        };

        //dividir un string en substrings mediante un patron.
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo1 = trabalenguas.split("a");
        for (String index: arreglo1){
            System.out.println("arreglo1 = " + index);
        };

        String archivo = "Alguna_imagen.docx";
        String[] archivoArr = archivo.split("\\.");
        for (String index: archivoArr){
            System.out.println("archivoArr = " + index);
        };

        System.out.println("archivoArr = " + archivoArr[archivoArr.length-1]);

    }

}

package com.wjnnovoa.string;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres guzman";

        String detalle = curso + " con el intructor "+profesor;
        System.out.println(detalle);

        //Concatenacion y despues una suma o cualquier operacion
        System.out.println(detalle + (34 + 43));

        //CONCATENACION CON CONCAT

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("curso.concat( con ).concat(profesor) = " + detalle2);




    }
}

package com.wjnnovoa.claseswrapper;

import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {
        //get class tiene todos los objetos de java

        //getCLass nos retorna informacion sobre el objeto, su estructura interna de la clase
        String texto = "Hola que tal";

        Class strClass =  texto.getClass();

        //El nombre del archivo donde esta el objeto
        System.out.println("texto.getName() = " + strClass.getName());
        System.out.println("texto.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("texto.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for(Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass);
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getPackageName() = " + intClass.getPackageName());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());


        for(Method metodo: intClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }


    }
}

package com.wjnnovoa.flujodecontrol;

public class SentenciaForEach {
    public static void main(String[] args) {
        //SE UTILIZA PARA ITERAR SOBRE ARREGLOS O OBJETOS DE COLECCION DE JAVA QUE SON TIPO ITERABLE

        int [] numeros = {1,2,3,4,5,6,7,8,9};
        for(int numero: numeros){
            System.out.println("numero = " + numero);
        }

        String [] nombres = {"Andres", "William", "Lina", "Emilce", "Melendrez"};
        for (String nombre: nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
}

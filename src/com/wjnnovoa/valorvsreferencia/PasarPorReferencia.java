package com.wjnnovoa.valorvsreferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int [] edad = {34,52,12};

        System.out.println("iniciamos el metodo main");
        //Foreach recorriendo el arreglo edad
        for (int i: edad) {
            System.out.println("edad[i] = " + i);
        }
        System.out.println("Antes de llamar el metodo test");

        //LLamada del metodo test
        test(edad);

        System.out.println("Despues de llamar el metodo test");
        for (int i: edad) {
            System.out.println("edad[i] = " + i);
        }
        System.out.println("Finaliza el metodo main");
    }

    public static void test(int[] edadArr){
        System.out.println("iniciamos el metodo test");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Finaliza el metodo test");
    }
}

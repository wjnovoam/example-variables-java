package com.wjnnovoa.valorvsreferencia;

public class PasarPorValor {
    public static void main(String[] args) {

        //Toda variable primitiva siempre se pasa por valor

        int i = 10;
        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i (se mantiene igual) = " + i);
    }

    public static void test(int i){
        System.out.println("iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("Finaliza el metodo test con i = " + i);
    }
}

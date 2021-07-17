package com.wjnnovoa.claseswrapper;

public class WrapperAutoboxingUnboxing {
    public static void main(String[] args) {
        //Autoboxing -> es cuando empaquetamos o convertimos un primitivo en un clase wrapper
        //Unboxing -> Pasar de un valor primitivo a referencia o referencia a  primitivo

        Integer [] enteros = {1,2,3,4,5,6,7,8,9,12,13,14,15,133};

        int suma = 0;

        for (Integer i : enteros){
            if(i % 2 ==0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}

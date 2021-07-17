package com.wjnnovoa.claseswrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        
        Integer intObjeto = 123456;
        System.out.println("intObjeto = " + intObjeto);
        String s = intObjeto.toString();
        System.out.println("s = " + s);

        int num = intObjeto; // ES lo mismo que esto intObjeto.intValue();
        System.out.println("num = " + num);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

    }
}

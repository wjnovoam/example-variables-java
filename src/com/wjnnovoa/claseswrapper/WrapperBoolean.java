package com.wjnnovoa.claseswrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;

        num1 = 1;
        num2 = 2;

        boolean primBooelan = num1 > num2; //false
        Boolean objBoolean = primBooelan;
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;

        System.out.println("Comparando dos objetos boolean: "+ (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: "+ (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean: "+ (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos objetos boolean: "+ (objBoolean == objBoolean3));


        boolean primBoolean2 = objBoolean2;
    }
}

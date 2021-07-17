package com.wjnnovoa.operadores;

public class OperadorInstanceOfTiposGenericosOAbstractos {
    public static void main(String[] args) {
        //Tipo generico

        Object texto = "Creando un ibjeto de la clase string ... que tal";

        Number num = Integer.valueOf(7); //7;

        boolean b1 = texto instanceof String;
        System.out.println("Texto es del texto String = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer = " + b1);

        boolean b2 = num instanceof Integer;
        System.out.println("Num es del tipo Integer = " + b2);

        b2 = num instanceof Long;
        System.out.println("num es de tipo long = " + b2);

        b2 = num instanceof Double;
        System.out.println("num es de tipo double = " + b2);

        //TODAS LAS CLASES, OBJETOS DE JAVA HEREDAN DE OBJECT
        boolean b3 = num instanceof Object;
        System.out.println("Num es intaciada de la clase Object = " + b3);

        boolean b4 = num instanceof Number;
        System.out.println("Num es instanciada de la clase Number = " + b4);

        Double decimal = 45.54;
        boolean b5 = decimal instanceof Number;
        System.out.println("Double decimal es instnaciada de la clase Number = " + b5);

        Boolean b6 = true;
        boolean b7 = b6 instanceof Boolean;
        System.out.println("Boolean b6 es intanciaso de la clase Boolean = " + b6);

    }
}

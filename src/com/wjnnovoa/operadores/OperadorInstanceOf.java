package com.wjnnovoa.operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        //NOS PERMITE VALIDAR SI UNA INSTANCIA, UN OBJETO ES REFERENCIA DE UN TIPO, POR EJEMPLO
        // DE UNA CLASE DE UNA INTERFAZ O DE UN SUBTIPO,
        String texto = "Creando un ibjeto de la clase string ... que tal";
        Integer num = 7;

        boolean b1 = texto instanceof String;
        System.out.println("Texto es del texto String = " + b1);

        boolean b2 = num instanceof Integer;
        System.out.println("Num es del num Integer = " + b2);

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

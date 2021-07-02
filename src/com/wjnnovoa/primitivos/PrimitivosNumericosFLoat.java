package com.wjnnovoa.primitivos;

public class PrimitivosNumericosFLoat {
    public static void main(String[] args) {

        //FLOAT
        float realFloat = 234212.0f; //Siempre al float se le pone una f al final
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde en byte a "+ Float.BYTES);
        System.out.println("Tipo float corresponde en bites a "+ Float.SIZE);
        System.out.println("Valor maximo de un float "+Float.MAX_VALUE);
        System.out.println("Valor minimo de un float "+Float.MIN_VALUE);
        System.out.println("*******************************");

        //DOUBLE
        double realDouble = 3.423552; //No es necesario ponerle una d al final
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo Double corresponde en byte a "+ Double.BYTES);
        System.out.println("Tipo Double corresponde en bites a "+ Double.SIZE);
        System.out.println("Valor maximo de un Double "+Double.MAX_VALUE);
        System.out.println("Valor minimo de un Double "+Double.MIN_VALUE);
        System.out.println("*******************************");
    }

}

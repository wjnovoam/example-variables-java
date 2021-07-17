package com.wjnnovoa.claseswrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = 1000;
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? "+ (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? "+ (num1 == num2));

        System.out.println("Tienen el mismo valor? "+ (num1.equals(num2)));
        System.out.println("Tienen el mismo valor? "+ (num1.intValue() == num2.intValue()));

        num2 = 2000;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        //Autoboxing -> es cuando empaquetamos o convertimos un primitivo en un clase wrapper
        //Unboxing -> Pasar de un valor primitivo a referencia o referencia a  primitivo
    }
}

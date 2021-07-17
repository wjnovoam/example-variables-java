package com.wjnnovoa.operadores;

public class OperadorDeAsignacion {
    public static void main(String[] args) {

        //ASIGNACION =
        int i = 5;
        int j = i + 4;

        //OPERADORES COMPUESTOS DE SUMA
        i += 2; // i = i + 2;
        System.out.println("i += 2 = " + i);

        //OPERADOR COMPUESTO DE RESTA
        j -= 4; // j = j - 4;
        System.out.println("j -= 4 = " + j);

        //OPERADOR COMPUESTO DE MULTIPLICACION
        j *= 3;
        System.out.println("j *= 3 = " + j);

        //OPERADOR COMPUESTO DE STRING
        String sqlString = "select * from cliente as c";
        sqlString += " where c.nombre='andres'";
        sqlString += " and c.activo=1";

        System.out.println("sqlString = " + sqlString);






    }
}

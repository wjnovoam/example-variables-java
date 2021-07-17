package com.wjnnovoa.operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        //TERNARIO PORQUE ESTA FORMADO POR TRES ELEMEMTOS O TRES PARTES

        //variable = (condicion) ? si es verdadero : si es falso;

        String variable = (7 == 7)?"Si es verdadero": "Si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        estado = (promedio >= 5.49)?"Aprobado": "Rechazado";
        System.out.println("estado = " + estado);


    }
}

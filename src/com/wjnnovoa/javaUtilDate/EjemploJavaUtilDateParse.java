package com.wjnnovoa.javaUtilDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        //Convertir una fecha recibida en string a objeto del  tipo Date
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            String fechaIngresada = "2020-01-25";
            Date fecha = format.parse(fechaIngresada);
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();

            if(fecha.after(fecha2)){
                System.out.println(" Fecha1 (del usuario) es despues que fecha 2 = " );
            }else if(fecha.before(fecha2)){
                System.out.println("Fecha es anterior que fecha2");
            }else if(fecha.equals(fecha2)){
                System.out.println("fecha1 es igual a fecha2");
            }

            //Otra forma de comparar fechas
            if(fecha.compareTo(fecha2) > 0){
                System.out.println(" Fecha1 (del usuario) es despues que fecha 2 = " );
            }else if(fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha es anterior que fecha2");
            }else if(fecha.compareTo(fecha2) == 0){
                System.out.println("fecha1 es igual a fecha2");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}

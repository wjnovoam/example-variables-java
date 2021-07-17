package com.wjnnovoa.javaUtilDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        //Intancia de Date
        Date fecha = new Date();
        //Muestra la fecha completa
        System.out.println("fecha = " + fecha);

        //Nos permite dar formato a nuestra fecha
        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);



    }
}

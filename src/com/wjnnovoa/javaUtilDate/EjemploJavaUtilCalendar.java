package com.wjnnovoa.javaUtilDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        //set -> nos permite indicar una fecha en particular
        //calendario.set(2020, Calendar.FEBRUARY, 25, 0,20, 10);

        //Otra forma de asiganr una fecha en particular parte por parte
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH,25);
        calendario.set(Calendar.AM_PM, Calendar.AM);
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);

        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss a");
        String fecharStr = formato.format(fecha);
        System.out.println("fecha con formato dd-MMMM-yyyy HH:mm:ss = " + fecharStr);


    }
}

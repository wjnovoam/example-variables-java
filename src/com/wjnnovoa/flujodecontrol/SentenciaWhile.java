package com.wjnnovoa.flujodecontrol;

public class SentenciaWhile {
    public static void main(String[] args) {
        //WHILE -> EJECUTA EL CODIGO MIENTRAS SE CUMPLA LA CONDICION
        int i = 0;
        while(i < 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;
        while(prueba){
            if(i == 7){
              prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        // DO WHILE -> EJECUTA EL BLOQUE AL MENOS UNA VEZ

        prueba = false;
        do{
            System.out.println("Se ejecuta al menos una vez");
        }while(prueba);

        prueba = true;
        i=0;
        do{
            if(i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while (prueba);
    }
}

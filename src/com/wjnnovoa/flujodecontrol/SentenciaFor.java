package com.wjnnovoa.flujodecontrol;

public class SentenciaFor {
    public static void main(String[] args) {

        /*
        for(inicializacion, condicion, incremento){
            //Ejecucion
        }
        * */

        for (int i = 0; i <= 5; i++){
            System.out.println("i = " + i);
        }

        //Tambien se puede declarar j afuera, y ahi estaria a el  alcance del metodo
        int j = 0;
        for(; j<=5;j++){
            System.out.println("j = " + j);
        }

        //break -> terminar la condicion o el ciclo

        int l  = 0;
        for(;l < 5;) {
            System.out.println(" l = " + l);
            l++;
        }

        //OTRO EJEMPLO

        for (int i = 1, k = 10; i < k; i++, k--) {
            System.out.println("i = " + i);
            System.out.println("k = " + k);
        }

    }

}

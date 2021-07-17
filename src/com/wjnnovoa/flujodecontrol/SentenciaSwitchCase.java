package com.wjnnovoa.flujodecontrol;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        byte num = 3; //soporta short, int, byte, char, String, enum
        switch(num){
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es 1");
                break;
            case 3:
                System.out.println("El numero es 3");
                break;
            default:
                System.out.println("El numero no es ninguno  de los anteriores");
                break;
        }

        //SWITCH CON UN STRING

        String nombre = "pepe";

        switch(nombre){
            case "william":
                System.out.println("Hola william");
                break;
            case "andres":
                System.out.println("Hola andres");
                break;
            case "pepe":
                System.out.println("Hola pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
                break;
        }
    }
}

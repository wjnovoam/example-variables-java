package com.wjnnovoa.primitivos;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        //ENTRADA DE DATOS DESDE UNA VENTANA DE DIALOGO
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal = 0;
        try{
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERROR debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        //BINARIO
        String mensajeBinario = "numero binario de " + numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        //se le agrega 0b oa saber que es un numero binario
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //OCTAL
        String mensajeOctal = "numero octal de " + numeroDecimal+ " = "+Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        int numeroObtal = 0764;
        System.out.println("numeroObtal = " + numeroObtal);

        //HEXADECIMAL
        String mensajeHex = "numero hexadecimal de " + numeroDecimal+ " = "+Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHex);
        // a un numero hexadecimal se le agrega 0x al inicio
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        //VENTANA DE DIALOGO
        String mensaje = mensajeBinario;
        mensaje += "\n"+mensajeOctal;
        mensaje += "\n"+mensajeHex;
        JOptionPane.showMessageDialog(null, mensaje);



    }
}

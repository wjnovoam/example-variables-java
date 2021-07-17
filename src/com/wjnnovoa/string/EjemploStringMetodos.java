package com.wjnnovoa.string;

import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "William";
        //TAMAÑO DEL STRING
        System.out.println("nombre.length() = " + nombre.length());
        //CONVERTIR EN MAYUSCULA
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        //CONVERTIR EN MINUSCULA
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        //COMPARA STRING A NIVEL DE VALOR Y NO DE INSTANCIA
        System.out.println("nombre.equals(\"William\") = " + nombre.equals("William"));
        System.out.println("nombre.equals(\"William\") = " + nombre.equals("william"));
        //COMPARA STRING A NIVEL VALOR Y NO DE MAYUSCULAS Y MINUSCULA
        System.out.println("nombre.equalsIgnoreCase(\"William\") = " + nombre.equalsIgnoreCase("william"));
        //COMPARA SOBRE ORDEN NUMERICO DE LA TABLA UNICODE Y SI ES IGUAL A CERO SON IGUALES 
        System.out.println("nombre.compareTo(\"William\") = " + nombre.compareTo("William"));
        //CONVERTIR UN STRING EN CARACTERES nombre.charAt(num)
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        //OBTENER PARTE O UN FRAGMENTO DEL STRING .substring(numDesde, numHasta) o solo se le puede enviar uno solo
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));

        String trabaLengua = "trabalenguas";

        //REMPLAZAR UN CARACTER POR OTRO .replace(caracterARemplazar, caracterNuevo)
        System.out.println("trabaLengua.replace(\"a\", \"A\") = " + trabaLengua.replace("a", "."));
        //PERMITE SABER SI SE ENCUENTRA UN STRING O CARACTER EN EL STRING Y RETORNA LA POSICION DEL INDICE DE LA PRIMERA COINCIDENCIA
        System.out.println("trabaLengua.indexOf(\"a\") = " + trabaLengua.indexOf("a"));
        //PERMITE SABER SI SE ENCUENTRA UN STRING O CARACTER EN EL STRING Y RETORNA LA POSICION DEL INDICE DE LA ULTIMA COINCIDENCIA
        System.out.println("trabaLengua.lastIndexOf(\"a\") = " + trabaLengua.lastIndexOf("a")); //cuando no lo encuentra bota -1
        //PERMITE SABER SI SE ENCUENTRA UN STRING Y RETORNA TRUE O FALSE
        System.out.println("trabaLengua.contains(\"t\") = " + trabaLengua.contains("t"));
        //PERMITE SABER SI COMIENZA CON LA PALABRA ENVIADA Y RETORNA TRUE O FALSE
        System.out.println("trabaLengua.startsWith(\"traba\") = " + trabaLengua.startsWith("traba"));
        //PERMITE SABER SI TERMINA CON LA PALABRA ENVIADA Y RETORNA TRUE O FALSE
        System.out.println("trabaLengua.endsWith(\"guas\") = " + trabaLengua.endsWith("guas"));

        //QUITAR ESPACIOS AL INICIO Y AL FINAL
        System.out.println(" trabaLengua ".trim());


    }

}

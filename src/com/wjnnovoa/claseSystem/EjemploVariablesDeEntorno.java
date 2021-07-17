package com.wjnnovoa.claseSystem;

import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        //OBTENER LAS VARIABLES DE AMBIENTE DEL SISTEMA OPERATIVO

        //OBETNER TODAS
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente o de  entorno del sistema = " + varEnv);

        for(String key: varEnv.keySet()){
            System.out.println(key +" => "+varEnv.get(key));
        }

        //OBTENER UNA EN PARTICULAR
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

    }
}

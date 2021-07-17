package com.wjnnovoa.claseSystem;

import java.util.Properties;

public class EjemploPropiedadesDelSistema {
    public static void main(String[] args) {
        //nombre de usuario del sistema operativo
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        //Ruta del usuario del sistema operativo
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        //Espacio de trabajo o el directorio
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        //Version de java
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        //Salto de linea
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator+ "Una nueva linea");

        //Listar todas las propiedades del sistema
        Properties p  = System.getProperties();
        p.list(System.out);

    }
}

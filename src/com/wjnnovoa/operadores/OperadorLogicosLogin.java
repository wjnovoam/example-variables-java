package com.wjnnovoa.operadores;

import java.util.Scanner;

public class OperadorLogicosLogin {
    public static void main(String[] args) {

        /*String [] usernames = new String[2];
        String [] passwords = new String[2];

        usernames[0] = "william";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "admin";*/

        String [] usernames = {"william", "admin"};
        String [] passwords = {"12345", "admin"};

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String user = sc.nextLine();

        System.out.println("Ingrese el password");
        String pass = sc.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            esAutenticado = (usernames[i].equals(user) && passwords[i].equals(pass))? true : esAutenticado;
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(user).concat("!")
                : "Username o contraseña incorrecta! \n Lo siento, requiere autenticacion";

        System.out.println("mensaje = " + mensaje);

        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(user).concat("!"));
        }else{
            System.out.println("Username o contraseña incorrecta!");
            System.out.println("Lo siento, requiere autenticacion");
        }*/
    }
}

package com.wjnnovoa.lineadecomando;

public class ArgumentoLineaComando {
    public static void main(String[] args) {

        //0 -> todo sale bien
        //1 -> Cuando ocurre una excepcion
        //-1 -> Cuando ocurrer un error

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parametros");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos nro "+ i + ": "+ args[i]);
        }
    }
}

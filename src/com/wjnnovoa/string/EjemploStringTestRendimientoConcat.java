package com.wjnnovoa.string;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        //FORMA MAS EFICIENTE DE CONCATENAR
        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 500; i++){
            //c = c.concat(a).concat(b).concat("\n"); //500 -< 16ms
            //c += a + b + "\n"; //500 -> 154ms
            sb.append(a).append(b).append("\n"); //500 -> 8ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }
}

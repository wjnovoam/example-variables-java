package com.wjnnovoa.valorvsreferencia;

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("andres");

        System.out.println("iniciamos el metodo main");
        //Foreach recorriendo el arreglo edad
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Antes de llamar el metodo test");

        //LLamada del metodo test
        test(persona);

        System.out.println("Despues de llamar el metodo test");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Finaliza el metodo main");
    }

    public static void test(Persona persona){
        System.out.println("iniciamos el metodo test");
        persona.modificarNombre("pepe");
        System.out.println("Finaliza el metodo test");
    }
}

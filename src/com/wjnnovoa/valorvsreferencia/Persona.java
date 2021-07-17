package com.wjnnovoa.valorvsreferencia;

public class Persona {
    //modificador de acceso, tipo , nombre
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return nombre;
    }
}

package com.wjnnovoa.claseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistemas {
    public static void main(String[] args) {
        //para agregar un nueva configuracion Se hace creando un archivo config.properties

        try {
            FileInputStream archivo = new FileInputStream("src/com/wjnnovoa/claseSystem/config.properties");

            Properties p = new Properties(System.getProperties());
            //Cargar la nueva config.properties
            p.load(archivo);
            //Agregar una sola properti ("llave", "valor")
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            //Antes de listar actualizamos todas las properties
            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (Exception e) {
            System.out.println("No existe el archivo = " + e);
        }
    }
}

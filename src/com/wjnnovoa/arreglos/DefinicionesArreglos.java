package com.wjnnovoa.arreglos;

public class DefinicionesArreglos {
    public static void main(String[] args) {
        /*
        ## ¿Que son los arreglos en JAVA? ##

        -> Son tipos de datos de referencia que contienen varios elementos ordenados, o una coleccion
        -> Sus elementos o valores estan asociados a una llave o indice y puede contener tipos de referencia o primitivos
        pero siempre asociado a un solo tipo de datos

        ## Declaracion e intanciacion de un arreglo ##

        -> La declaracion de un arreglo tiene dos partes: el tipo de datos del arreglo seguido de corhcetes
        y el nombre de la variable

        int [] numeros;

        -> Un tipo de array incluye el tipo de dato de los elementos que va  acontener
        -> Cuando se crea un array, se utiliza el operador new, mas el tipo de los elementos, mas el
        nnumero de los elementos

        int [] numeros = new int[3]
        int numeros[] = new int[3] -> otra forma

        -> Tambien podemos almacenar elementos del tipo de referencia y de objeto (Guarda es una referencia del objeto)

        Producto[] productos = new Producto[5]

        ## Inicializacion de elementos ##

        -> Asignamos elementos mediante la llave o indice

        # EJEMPLO ENTEROS #

        int [] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        $ EJEMPLO OBJETOS #

        Producto[] productos = new Producto[3];
        productos[0] = new Producto("mesa comedor");
        productos[1] = new Producto("TV LG");
        productos[2] = new Producto("Bicicleta");

        # EJEMPLO STRING #

        String[] nombres = new String[3];
        nombres[0]= "william";
        nombres[1]= "lina";
        nombres[2]= "emilce";

        ## OBTENER O ACCEDER A UN VALOR EN PARTICULAR ##

        int num1 = numeros[0]; // ahi obtiene el valor de la posicion 0 del arreglo de enteros
        Producto mesa = productos[0]; //ahi obtiene el valor de la posicion 0 del arreglo de objetos
        String nombre1 = nombres[0]; //ahi obtiene el valor de la posicion 0 del arreglo de Strings

        ## Declaracion, instanciacion e inicializacion de un arreglo ##

        -> Se usa cuando ya conocemos la cantidad de elementos que va a contener

        # EJEMPLO ENTEROS #

        int [] numeros = {1,2,3};

        # EJEMPLO OBJETOS #

        Producto[] productos = {new Producto("mesa comedor"),new Producto("TV LG"), new Producto("Bicicleta") }

        # EJEMPLO STRING #

        String [] nombres = {"william", "Johan", "lina"}

        ## Recorrer arreglo usando un for ##

        for(int i = 0; i < nombreArreglo.length; i++){
            sout("nombre="+ nombre[i]);
        }

        ## Recorrer arreglo usando for each ##

        for(String nom: nombreArreglo){
            sout("nombre="+ nom);
        }

        ## Ventajas de los arreglos ##

        -> Guardar elementos optimizados
        -> Acceder y ordenar elementos de un arreglo de forma eficiente
        -> De acceso rapido

        ## Desventaja de los arreglos ##

        -> Solo se puede almacenar un tamaño fijo de elementos, es decir no podemos hacer que su tamaño
        cresca o decremente en tiempo de ejecucion

        -> Para solventar la desventaja anterior podemos utilizar la collection de java de tipo list, o clonar
        el mismo arreglo con mayor capacidad
        */


    }
}

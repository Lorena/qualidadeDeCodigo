package com.primeiros.passos.oo.visto;

public class Application {

    public static void main (String[] args){

        Visto vistoLorena = new Visto("Lorena",
                                    "Souza",
                                    "Brasileira",
                                    "08/07/2000",
                            "F00021232", "F", "Mulher", "EUA", "01/2020", "A1");


        System.out.println(vistoLorena.toString());

        vistoLorena.trocaCategoriaDoVisto();

        System.out.println(vistoLorena.toString());

    }

}

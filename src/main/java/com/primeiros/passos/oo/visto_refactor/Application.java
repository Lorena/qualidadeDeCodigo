package com.primeiros.passos.oo.visto_refactor;

import com.primeiros.passos.oo.visto.Pessoa;

public class Application {

    public static void main (String[] args){

        Pessoa maria = new Pessoa(  "Maria",
                                    "Souza",
                                    "Brasileira",
                                    "08/07/2000",
                                    "F00021232",
                                    "F",
                                    "Mulher");

        Visto vistoMaria = new Visto("EUA", "01/2020", "A1", maria);

        System.out.print(vistoMaria.toString());

        vistoMaria.trocaCategoriaDoVisto();

        System.out.print(vistoMaria.toString());

    }
}

package com.segundo.passo.oo.encapsulamento.codigo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AnalisaCodigo {
    private int qtdIfs = 0;

    public int analisa () {

        List<File> todosArquivos = todosArquivosJava();

        int qtdIfs = 0;
        for (File arquivo : todosArquivos) {

            String coding = readFile(arquivo);
            String[ ] tokens = coding.split("");

            for(String token : tokens) {
                if(token.equals("if"))
                qtdIfs = qtdIfs + 1;
            }

        }

        return qtdIfs;
    }

    private String readFile(File arquivo) {
        return "";
    }

    private List<File> todosArquivosJava() {return new ArrayList<File>();}
}

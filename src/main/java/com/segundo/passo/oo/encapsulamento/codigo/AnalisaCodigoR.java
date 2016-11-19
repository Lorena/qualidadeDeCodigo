package com.segundo.passo.oo.encapsulamento.codigo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AnalisaCodigoR {
    private int quantidadeDeIfs = 0;

    public int analisa(){
            List<File> todosArquivos = todosArquivosJava();

            for(File arquivo : todosArquivos) {
                contaIfs(arquivo);
            }
            return quantidadeDeIfs;
    }

    private void contaIfs(File arquivo) { /* conta ifs de cada arquivo */ }

    private List<File> todosArquivosJava() {return new ArrayList<File>();}
}

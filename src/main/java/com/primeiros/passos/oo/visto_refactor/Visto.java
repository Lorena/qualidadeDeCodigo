package com.primeiros.passos.oo.visto_refactor;

import com.primeiros.passos.oo.visto.Pessoa;

public class Visto {

    private String paisOfereceVisto;
    private String dataVencimentoVisto;
    private String categoriaDoVisto;
    private Pessoa pessoa;

    public Visto(String paisOfereceVisto,
                 String dataVencimentoVisto,
                 String categoriaDoVisto,
                 Pessoa pessoa) {
        this.paisOfereceVisto = paisOfereceVisto;
        this.dataVencimentoVisto = dataVencimentoVisto;
        this.categoriaDoVisto = categoriaDoVisto;
        this.pessoa = pessoa;
    }

    public void trocaCategoriaDoVisto() {
        if(this.getCategoriaDoVisto().equals("A1"))
        this.setCategoriaDoVisto("A2");
    }

    public void setCategoriaDoVisto(String categoriaDoVisto) {
        this.categoriaDoVisto = categoriaDoVisto;
    }

    public String getCategoriaDoVisto() {
        return categoriaDoVisto;
    }

    @Override
    public String toString() {
        return  "\n" + "Visto{" +
                "PaisOfereceVisto='" + paisOfereceVisto + '\'' +
                ", DataVencimentoVisto='" + dataVencimentoVisto + '\'' +
                ", CategoriaDoVisto='" + categoriaDoVisto + '\'' +
                ", Pessoa=" + pessoa.getNome() +
                '}' + "\n";
    }
}
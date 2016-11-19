package com.primeiros.passos.oo.visto_refactor;


public class Pessoa {

    private String nome;
    private String sobrenome;
    private String nacionalidade;
    private String dataNascimento;
    private String numeroDoPassaporte;
    private String sexo;
    private String identidadeDeGenero;


    public Pessoa(String nome, String sobrenome, String nacionalidade, String dataNascimento, String numeroDoPassaporte, String sexo, String identidadeDeGenero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.numeroDoPassaporte = numeroDoPassaporte;
        this.sexo = sexo;
        this.identidadeDeGenero = identidadeDeGenero;
    }

    public String getNome() {
        return nome;
    }
}

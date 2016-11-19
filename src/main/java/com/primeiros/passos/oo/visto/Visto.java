package com.primeiros.passos.oo.visto;


public class Visto {

    private String nome;
    private String sobrenome;
    private String nacionalidade;
    private String dataNascimento;
    private String numeroDoPassaporte;
    private String sexo;
    private String identidadeDeGenero;

    private String paisOfereceVisto;
    private String dataVencimentoVisto;
    private String categoriaDoVisto;

    private int idVisto;

    public Visto(String nome, String sobrenome, String nacionalidade, String dataNascimento, String numeroDoPassaporte, String sexo, String identidadeDeGenero, String paisOfereceVisto, String dataVencimentoVisto, String categoriaDoVisto) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.numeroDoPassaporte = numeroDoPassaporte;
        this.sexo = sexo;
        this.identidadeDeGenero = identidadeDeGenero;
        this.paisOfereceVisto = paisOfereceVisto;
        this.dataVencimentoVisto = dataVencimentoVisto;
        this.categoriaDoVisto = categoriaDoVisto;
    }


    public String getCategoriaDoVisto() {
        return categoriaDoVisto;
    }

    public int getIdVisto() {
        return idVisto;
    }

    @Override
    public String toString() {
        return "Visto{" +
                "Nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                ", Nacionalidade='" + nacionalidade + '\'' +
                ", DataNascimento='" + dataNascimento + '\'' +
                ", NumeroDoPassaporte='" + numeroDoPassaporte + '\'' +
                ", Sexo='" + sexo + '\'' +
                ", IdentidadeDeGenero='" + identidadeDeGenero + '\'' +
                ", PaisOfereceVisto='" + paisOfereceVisto + '\'' +
                ", DataVencimentoVisto='" + dataVencimentoVisto + '\'' +
                ", CategoriaDoVisto='" + categoriaDoVisto + '\'' +
                '}';
    }

    public void trocaCategoriaDoVisto() {
        if (this.getCategoriaDoVisto().equals("A1")) {
            this.setCategoriaDoVisto("A2");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getNumeroDoPassaporte() {
        return numeroDoPassaporte;
    }

    public String getSexo() {
        return sexo;
    }

    public String getIdentidadeDeGenero() {
        return identidadeDeGenero;
    }

    public String getPaisOfereceVisto() {
        return paisOfereceVisto;
    }

    public String getDataVencimentoVisto() {
        return dataVencimentoVisto;
    }

    public void setCategoriaDoVisto(String categoriaDoVisto) {
        this.categoriaDoVisto = categoriaDoVisto;
    }
}

package com.segundo.passo.oo.solid.lsp.funcionario;

public class Funcionario {

    private String nome;
    private String dataAdmissao;
    private int bonus;

    private void receberDocumentos(){
        //uma implementação qualquer
    }

    protected void analisarDocumentos(){
        //uma implementação qualquer
    }

    protected void aprovarDocumentos(){
        //uma implementação qualquer
    }

    public int getBonus(){
        return bonus;
    }

    protected void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void calculaBonus(int valor){
        this.setBonus(2 * valor);
        System.out.print(this.getBonus());
    }
}
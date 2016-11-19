package com.segundo.passo.oo.coesao.funcionario.yesCoeso;

public enum Cargo {

    DESENVOLVEDOR(new RegraDezOuVintePorCento()),
    DBA (new RegraQuinzeOuVinteCincoPorCento()),
    TESTER(new RegraQuinzeOuVinteCincoPorCento());

    private RegraDeCalculo regraDeCalculo;

    Cargo (RegraDeCalculo regraDeCalculo){
        this.regraDeCalculo = regraDeCalculo;
    }

    public RegraDeCalculo getRegraDeCalculo() {
        return regraDeCalculo;
    }
}

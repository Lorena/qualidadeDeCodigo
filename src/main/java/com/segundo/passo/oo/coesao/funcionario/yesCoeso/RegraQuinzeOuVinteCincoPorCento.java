package com.segundo.passo.oo.coesao.funcionario.yesCoeso;

public class RegraQuinzeOuVinteCincoPorCento implements RegraDeCalculo{

    public double calcula(Funcionario funcionario) {

        if (funcionario.getSalarioBase() > 3000) {
            return funcionario.getSalarioBase() * 0.8;
        }else{
            return funcionario.getSalarioBase() * 0.9;
        }

    }
}

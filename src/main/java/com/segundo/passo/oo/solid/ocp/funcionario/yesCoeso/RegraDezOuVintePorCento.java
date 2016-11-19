package com.segundo.passo.oo.solid.ocp.funcionario.yesCoeso;

public class RegraDezOuVintePorCento implements RegraDeCalculo{

    public double calcula(Funcionario funcionario) {

        if (funcionario.getSalarioBase() > 4000) {
            return funcionario.getSalarioBase() * 0.8;
        }else{
            return funcionario.getSalarioBase() * 0.9;
        }
    }

}

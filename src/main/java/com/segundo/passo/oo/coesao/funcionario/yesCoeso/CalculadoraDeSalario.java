package com.segundo.passo.oo.coesao.funcionario.yesCoeso;


import static com.segundo.passo.oo.coesao.funcionario.yesCoeso.Cargo.DBA;
import static com.segundo.passo.oo.coesao.funcionario.yesCoeso.Cargo.DESENVOLVEDOR;
import static com.segundo.passo.oo.coesao.funcionario.yesCoeso.Cargo.TESTER;

public class CalculadoraDeSalario {

    public double calculaAumentoDeSalarioPorRegra(Funcionario funcionario){

    if(DESENVOLVEDOR.equals(funcionario.getCargo())){
        return new RegraDezOuVintePorCento().calcula(funcionario);
    }

    if(DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())){
        return new RegraQuinzeOuVinteCincoPorCento().calcula(funcionario);
    }

    throw new RuntimeException("funcionário inválido");
}

}

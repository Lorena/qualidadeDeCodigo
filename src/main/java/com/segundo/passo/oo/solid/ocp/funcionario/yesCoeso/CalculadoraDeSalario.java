package com.segundo.passo.oo.solid.ocp.funcionario.yesCoeso;



public class CalculadoraDeSalario {

    RegraDeCalculo regraDeCalculo;

    public CalculadoraDeSalario(RegraDeCalculo regraDeCalculo) {
        this.regraDeCalculo = regraDeCalculo;
    }

    public double calculaAumentoDeSalarioPorRegra(Funcionario funcionario){

        return regraDeCalculo.calcula(funcionario);

    }
}

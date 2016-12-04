package com.segundo.passo.oo.coesao.funcionario.noCoeso;

import static com.segundo.passo.oo.coesao.funcionario.noCoeso.Cargo.DBA;
import static com.segundo.passo.oo.coesao.funcionario.noCoeso.Cargo.DESENVOLVEDOR;
import static com.segundo.passo.oo.coesao.funcionario.noCoeso.Cargo.TESTER;

public class CalculadoraDeSalario {

    public double calcula(Funcionario funcionario){

    if(DESENVOLVEDOR.equals(funcionario.getCargo())){
        return dezOuVintePorcento(funcionario);
    }

    if(DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())){
        return quinzeOuVinteCincoPorcento(funcionario);
    }

    throw new RuntimeException("funcionário inválido");
}

    private double quinzeOuVinteCincoPorcento(Funcionario funcionario) {

        if (funcionario.getSalarioBase() > 3000) {
            return funcionario.getSalarioBase() * 0.75;
        }else{
            return funcionario.getSalarioBase() * 0.85;
        }
    }

    private double dezOuVintePorcento(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 4000) {
            return funcionario.getSalarioBase() * 0.8;
        }else{
            return funcionario.getSalarioBase() * 0.9;
        }
    }
}

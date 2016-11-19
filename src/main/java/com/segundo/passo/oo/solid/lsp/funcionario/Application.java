package com.segundo.passo.oo.solid.lsp.funcionario;

public class Application {

    public static void main (String[] args){

        Gerente gerente = new Gerente();
        Funcionario funcionario = new Funcionario();
        gerente.calculaBonus(1000);

    }
}
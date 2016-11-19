package com.primeiros.passos.oo.funcionario;

public class Application {

    public static void main (String[] args){

        Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;
        funcionario.calcularBonus(1000);

        //Gerente gerente = new Funcionario();


    }
}
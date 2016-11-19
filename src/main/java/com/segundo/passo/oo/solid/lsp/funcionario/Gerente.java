package com.segundo.passo.oo.solid.lsp.funcionario;

public class Gerente extends Funcionario {

   public void calculaBonus(int valor){
        this.setBonus(4 * valor);
        System.out.print(this.getBonus());
    }

}

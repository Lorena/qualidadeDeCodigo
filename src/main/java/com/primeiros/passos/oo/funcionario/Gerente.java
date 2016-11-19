package com.primeiros.passos.oo.funcionario;

public class Gerente extends Funcionario {

    @Override
   public void calcularBonus(int valor){
        this.setBonus(4 * valor);
        System.out.print(this.getBonus());
    }

}

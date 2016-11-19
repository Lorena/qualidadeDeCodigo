package com.segundo.passo.oo.solid.isp.outrasInterfaces;


import com.segundo.passo.oo.solid.isp.veiculo.notExistException;

public interface ICarro {
    void ligar();

    void acelerar();

    void freiarComPe();

    void freiarComMao();

    void darSeta();

    void limpadorDeParabrisa();

    void virarParaDireta();

    void virarParaEsquerda();

    void passarMarcha(int numero);
}

package com.segundo.passo.oo.solid.isp.veiculo;


public interface IVeiculo {
    void ligar();

    void acelerar() throws notExistException;

    void freiarComPe() throws notExistException;

    void freiarComMao();

    void darSeta() throws notExistException;

    void limpadorDeParabrisa() throws notExistException;

    void virarParaDireta();

    void virarParaEsquerda();

    void passarMarcha(int numero) throws notExistException;
}

package com.segundo.passo.oo.solid.isp.veiculo;

public class Bicicleta implements IVeiculo{
    public void ligar() {

    }

    public void acelerar() throws notExistException {
        throw new notExistException();
    }

    public void freiarComPe() throws notExistException {
        throw new notExistException();
    }

    public void freiarComMao() {

    }

    public void darSeta() throws notExistException {
        throw new notExistException();
    }

    public void limpadorDeParabrisa() throws notExistException {
        throw new notExistException();
    }

    public void virarParaDireta() {

    }

    public void virarParaEsquerda() {

    }

    public void passarMarcha(int numero) throws notExistException {
        throw new notExistException();
    }
}

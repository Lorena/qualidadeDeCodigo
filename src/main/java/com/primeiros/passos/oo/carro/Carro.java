package com.primeiros.passos.oo.carro;

import com.primeiros.passos.oo.carro.motor.Motor;
import com.primeiros.passos.oo.carro.porta.Porta;
import com.primeiros.passos.oo.carro.roda.Roda;

import java.util.ArrayList;

public class Carro  implements ICarro {
    private ArrayList<Roda> rodas;
    private ArrayList<Porta> porta;
    private String cor;
    private String placa;
    private String modelo;
    private Motor motor;
    private String ano;

    public Carro(ArrayList<Roda> rodas, ArrayList<Porta> porta, String cor, String placa, String modelo, Motor motor, String ano) {
        this.rodas = rodas;
        this.porta = porta;
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.motor = motor;
        this.ano = ano;
    }

    public void ligar() {

    }

    public void acelerar() {

    }

    public void freiarComPe() {

    }

    public void freiarComMao() {

    }

    public void darSeta() {

    }

    public void limpadorDeParabrisa() {

    }

    public void virarParaDireta() {

    }

    public void virarParaEsquerda() {

    }

    public void passarMarcha(int numero) {

    }

}

package com.segundo.passo.oo.encapsulamento.pagamento;


import java.util.List;

public class ProcessadorDeBoletosR {

    public void processa(List<Boleto> boletos, Fatura fatura){

        double total = 0;

        for(Boleto boleto : boletos){

            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);

            fatura.getPagamentos().add(pagamento);

            total +=fatura.getValor();

        }

        //essa regra nao deveria estar no ProcessadorDeBoletos, mas sim na Classe Fatura
        //se amanha aparecer ProcessadorDeCartaoDeCredito, o desenvolvedor será obrigado
        //a repetir este codigo.
        if(total >= fatura.getValor()){
            fatura.setPago(true);
        }

    }

}

package com.segundo.passo.oo.coesao.notaFiscal;


import java.sql.SQLException;

public class NotaFiscal {

    Conexao conexao;

    public String cadastrarNotaFiscal (NotaFiscal nf) throws SQLException {

        //aplica uma regra de negocio
        if(nf.ehValida()){
            nf.duplicaImpostos( );
        }

        if(nf.ultrapassaValorLimite()){

            Smtp smtp = new Smtp();
            String template = leTemplateDoArquivo();
            smtp.enviaEmail(nf.getUsuario(), template);

            //persiste no bando de dados
            String query = "insert into NF(…) values(…)";
            Sql sql = conexao.preparaSQL(query);
            sql.execute();

            //envia nf para um webservice
            Soap ws = new Soap();
            ws.setUrl("http://www.meuerp.com.br");
            ws.setPort(80);
            ws.send(nf);

            //exibe página de sucesso
            return view("sucesso.jsp");

        } else {
            return view("erro-de-validacao.jsp");
        }

    }

    private String view(String s) {
            return s;
    }

    private String leTemplateDoArquivo() {
        return "";
    }

    private boolean ultrapassaValorLimite() {
        return true;
    }

    private void duplicaImpostos() {}

    private boolean ehValida() {
        return true;
    }


    public Object getUsuario() {
        return "";
    }
}

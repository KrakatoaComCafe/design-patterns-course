package designpatterns.impostos;

import designpatterns.state.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional {
    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getItens().size() * 1.0;
    }

    @Override
    public double maiorTaxacao(Orcamento orcamento) {
        return (orcamento.getValor() * 13.0) + 100.0;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.existemDoisItensIguaisNaLista();
    }
}

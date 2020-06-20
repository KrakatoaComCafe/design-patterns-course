package designpatterns.impostos;

import designpatterns.state.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

    public ICPP(Imposto impostoAdicional) {
        super(impostoAdicional);
    }

    public ICPP() {
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }

    @Override
    public double maiorTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }
}

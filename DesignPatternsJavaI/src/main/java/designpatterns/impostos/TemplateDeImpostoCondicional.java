package designpatterns.impostos;

import designpatterns.state.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

    public TemplateDeImpostoCondicional(Imposto impostoAdicional) {
        super(impostoAdicional);
    }

    public TemplateDeImpostoCondicional() {
    }

    @Override
    public double calcula(Orcamento orcamento) {
        if (deveUsarMaximaTaxacao(orcamento)) {
            return maiorTaxacao(orcamento) + calculaProximoImposto(orcamento);
        }
        return minimaTaxacao(orcamento) + calculaProximoImposto(orcamento);
    }

    public abstract double minimaTaxacao(Orcamento orcamento);

    public abstract double maiorTaxacao(Orcamento orcamento);

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}

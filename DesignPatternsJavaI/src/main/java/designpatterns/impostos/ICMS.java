package designpatterns.impostos;

import designpatterns.state.Orcamento;

public class ICMS extends Imposto {

    public ICMS(Imposto imposto) {
        super(imposto);
    }

    public ICMS() {
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculaProximoImposto(orcamento);
    }
}

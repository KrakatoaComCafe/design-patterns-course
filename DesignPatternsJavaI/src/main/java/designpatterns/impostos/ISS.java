package designpatterns.impostos;

import designpatterns.state.Orcamento;

public class ISS extends Imposto {

    public ISS(Imposto impostoAdicional) {
        super(impostoAdicional);
    }

    public ISS() {
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06 + calculaProximoImposto(orcamento);
    }
}

package designpatterns.impostos;

import designpatterns.state.Orcamento;

public abstract class Imposto {

    protected Imposto impostoAdicional;

    public Imposto(Imposto imposto) {
        this.impostoAdicional = imposto;
    }

    public Imposto() {}

    public abstract double calcula(Orcamento orcamento);

    protected double calculaProximoImposto(Orcamento orcamento) {
        if(impostoAdicional == null) {
            return 0;
        }
        return impostoAdicional.calcula(orcamento);
    }
}

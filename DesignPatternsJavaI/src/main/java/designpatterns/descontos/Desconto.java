package designpatterns.descontos;

import designpatterns.state.Orcamento;

public interface Desconto {

    double desconto(Orcamento orcamento);
}

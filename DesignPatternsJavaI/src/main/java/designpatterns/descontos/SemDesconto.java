package designpatterns.descontos;

import designpatterns.state.Orcamento;

public class SemDesconto implements Desconto {

    public double desconto(Orcamento orcamento) {
        return 0;
    }

    public void setProximoDesconto(Desconto proximoDesconto) {
        //Does nothing
    }
}

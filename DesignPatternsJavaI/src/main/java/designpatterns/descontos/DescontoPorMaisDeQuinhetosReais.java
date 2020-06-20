package designpatterns.descontos;

import designpatterns.state.Orcamento;

public class DescontoPorMaisDeQuinhetosReais implements Desconto {

    private Desconto proximoDesconto;

    public DescontoPorMaisDeQuinhetosReais(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    @Override
    public double desconto(Orcamento orcamento) {
        if(orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        }

        return proximoDesconto.desconto(orcamento);
    }
}

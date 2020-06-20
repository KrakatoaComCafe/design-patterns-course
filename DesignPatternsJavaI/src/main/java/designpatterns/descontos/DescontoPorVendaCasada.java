package designpatterns.descontos;

import designpatterns.Itens;
import designpatterns.state.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximoDesconto;

    public DescontoPorVendaCasada(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    @Override
    public double desconto(Orcamento orcamento) {
        if (existeCompraCasada(Itens.CANETA, Itens.LAPIS)) {
            return orcamento.getValor() * 0.05;
        }
        return proximoDesconto.desconto(orcamento);
    }

    private boolean existeCompraCasada(Itens item1, Itens item2) {
        return Itens.existeItensNaLista(item1, item2);
    }
}

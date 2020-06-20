package designpatterns.descontos;

import designpatterns.state.Orcamento;

public class DescontoPorCincoItens implements Desconto {

    private Desconto proximoDesconto;

    public DescontoPorCincoItens(Desconto proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public DescontoPorCincoItens() {
        this.proximoDesconto = null;
    }

    @Override
    public double desconto(Orcamento orcamento) {
        if(orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        } else if (this.proximoDesconto != null) {
            proximoDesconto.desconto(orcamento);
        }
        throw new RuntimeException("Formato de resposta não encontrado");
    }
}

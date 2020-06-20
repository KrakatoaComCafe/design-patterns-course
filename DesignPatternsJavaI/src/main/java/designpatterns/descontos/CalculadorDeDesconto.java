package designpatterns.descontos;

import designpatterns.state.Orcamento;

public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento) {
        Desconto d4 = new SemDesconto();
        Desconto d3 = new DescontoPorVendaCasada(d4);
        Desconto d2 = new DescontoPorMaisDeQuinhetosReais(d3);
        Desconto d1 = new DescontoPorCincoItens(d2);

        return d1.desconto(orcamento);
    }
}

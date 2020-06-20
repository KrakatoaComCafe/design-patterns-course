package designpatterns.impostos;

import designpatterns.state.Orcamento;

public class ICCC extends Imposto {

    public double calcula(Orcamento orcamento) {
        return this.definirTaxa(orcamento.getValor());
    }

    double definirTaxa(double valor) {
        if (valor < 1000.0) {
            return valor * 0.05;
        } else if (valor > 3000.0) {
            return (valor * 0.08) + 30.0;
        }
        return valor * 0.07;
    }
}

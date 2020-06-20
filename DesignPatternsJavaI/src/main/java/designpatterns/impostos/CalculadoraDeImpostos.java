package designpatterns.impostos;

import designpatterns.state.Orcamento;

public class CalculadoraDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
        double valor = imposto.calcula(orcamento);
        System.out.println(valor);
    }
}

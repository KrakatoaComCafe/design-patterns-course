package designpatterns;

import designpatterns.impostos.CalculadoraDeImpostos;
import designpatterns.impostos.ICCC;
import designpatterns.impostos.ICMS;
import designpatterns.impostos.ISS;
import designpatterns.impostos.Imposto;
import designpatterns.state.Orcamento;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        Imposto iccc = new ICCC();

        Orcamento orcamento = new Orcamento(0);

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        calculadora.realizaCalculo(orcamento, iss);
        calculadora.realizaCalculo(orcamento, icms);
        calculadora.realizaCalculo(orcamento, iccc);
    }
}

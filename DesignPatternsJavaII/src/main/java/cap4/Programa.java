package cap4;

import cap4.expressoes.Expressao;
import cap4.expressoes.Numero;
import cap4.expressoes.Soma;
import cap4.expressoes.Subtracao;

public class Programa {

    public static void main(String[] args) {

        Expressao conta = new Soma(new Numero(10), new Numero(20));

        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);

        Visitor visitor = new ImpressoraVisitor();
        PreFixoVisitor preFixoVisitor = new PreFixoVisitor();
        soma.aceita(visitor);
        System.out.println();
        soma.aceita(preFixoVisitor);
    }
}

package cap4;

import cap4.expressoes.Divisao;
import cap4.expressoes.Expressao;
import cap4.expressoes.Multiplicacao;
import cap4.expressoes.Numero;
import cap4.expressoes.RaizQuadrada;
import cap4.expressoes.Soma;
import cap4.expressoes.Subtracao;

public class ImpressoraVisitor implements Visitor {

    @Override
    public void aceitaSoma(Soma soma) {
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        System.out.print(" + ");
        soma.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void aceitaSubtracao(Subtracao subtracao) {
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        System.out.print(" - ");
        subtracao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void aceitaNumero(Numero numero) {
        System.out.print(numero.getNumero());
    }

    @Override
    public void aceitaMultiplicacao(Multiplicacao multiplicacao) {
        System.out.print("(");
        multiplicacao.getEsquerda().aceita(this);
        System.out.print(" * ");
        multiplicacao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void aceitaDivisao(Divisao divisao) {
        System.out.print("(");
        divisao.getEsquerda().aceita(this);
        System.out.print(" / ");
        divisao.getDireita().aceita(this);
        System.out.print(")");
    }

    @Override
    public void aceitaRaizQuadrada(RaizQuadrada raizQuadrada) {
        System.out.print(raizQuadrada.avalia());
    }
}

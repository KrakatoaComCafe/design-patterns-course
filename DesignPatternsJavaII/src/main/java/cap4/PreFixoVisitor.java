package cap4;

import cap4.expressoes.Divisao;
import cap4.expressoes.Multiplicacao;
import cap4.expressoes.Numero;
import cap4.expressoes.RaizQuadrada;
import cap4.expressoes.Soma;
import cap4.expressoes.Subtracao;

public class PreFixoVisitor implements Visitor {

    @Override
    public void aceitaSoma(Soma soma) {
        this.print("( + ");
        soma.getEsquerda().aceita(this);
        this.print(" ");
        soma.getDireita().aceita(this);
        this.print(" )");
    }

    @Override
    public void aceitaSubtracao(Subtracao subtracao) {
        this.print("( - ");
        subtracao.getEsquerda().aceita(this);
        this.print(" ");
        subtracao.getDireita().aceita(this);
        this.print(" )");
    }

    @Override
    public void aceitaMultiplicacao(Multiplicacao multiplicacao) {
        this.print("( * ");
        multiplicacao.getEsquerda().aceita(this);
        this.print(" ");
        multiplicacao.getDireita().aceita(this);
        this.print(" )");
    }

    @Override
    public void aceitaDivisao(Divisao divisao) {
        this.print("( / ");
        divisao.getEsquerda().aceita(this);
        this.print(" ");
        divisao.getDireita().aceita(this);
        this.print(" )");
    }

    @Override
    public void aceitaRaizQuadrada(RaizQuadrada raizQuadrada) {
        this.print(raizQuadrada.avalia());
    }

    @Override
    public void aceitaNumero(Numero numero) {
        this.print(numero.avalia());
    }

    private void print(String message) {
        System.out.print(message);
    }

    private void print(int message) {
        System.out.print(String.valueOf(message));
    }
}

package cap4.expressoes;

import cap4.Visitor;

public class Multiplicacao implements Expressao {

    private Expressao esquerda;
    private Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        return this.esquerda.avalia() * this.direita.avalia();
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.aceitaMultiplicacao(this);
    }

    public Expressao getEsquerda() {
        return this.esquerda;
    }

    public Expressao getDireita() {
        return this.direita;
    }
}

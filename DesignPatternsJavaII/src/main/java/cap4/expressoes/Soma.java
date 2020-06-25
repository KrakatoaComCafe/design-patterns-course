package cap4.expressoes;

import cap4.Visitor;

public class Soma implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Soma(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        return this.esquerda.avalia() + this.direita.avalia();
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.aceitaSoma(this);
    }

    public Expressao getEsquerda() {
        return this.esquerda;
    }

    public Expressao getDireita() {
        return this.direita;
    }
}

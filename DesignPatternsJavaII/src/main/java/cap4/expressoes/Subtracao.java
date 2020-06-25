package cap4.expressoes;

import cap4.ImpressoraVisitor;
import cap4.Visitor;

public class Subtracao implements Expressao {
    private final Expressao esquerda;
    private final Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {
        return this.esquerda.avalia() - this.direita.avalia();
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.aceitaSubtracao(this);
    }

    public Expressao getEsquerda() {
        return this.esquerda;
    }

    public Expressao getDireita() {
        return this.direita;
    }
}

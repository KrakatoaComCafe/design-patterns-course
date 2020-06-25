package cap4.expressoes;

import cap4.Visitor;

public class Numero implements Expressao {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return this.numero;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.aceitaNumero(this);
    }

    public int getNumero() {
        return this.numero;
    }
}

package cap4.expressoes;

import cap4.Visitor;

public class RaizQuadrada implements Expressao {
    private Expressao numero;

    public RaizQuadrada(Expressao numero) {
        this.numero = numero;
    }

    @Override
    public int avalia() {
        return (int) Math.sqrt(numero.avalia());
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.aceitaRaizQuadrada(this);
    }
}

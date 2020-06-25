package cap4.expressoes;

import cap4.Visitor;

public interface Expressao {

    int avalia();

    void aceita(Visitor visitor);
}

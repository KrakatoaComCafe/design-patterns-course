package cap4;

import cap4.expressoes.Divisao;
import cap4.expressoes.Multiplicacao;
import cap4.expressoes.Numero;
import cap4.expressoes.RaizQuadrada;
import cap4.expressoes.Soma;
import cap4.expressoes.Subtracao;

public interface Visitor {

    void aceitaSoma(Soma soma);
    void aceitaSubtracao(Subtracao subtracao);
    void aceitaMultiplicacao(Multiplicacao multiplicacao);
    void aceitaDivisao(Divisao divisao);
    void aceitaRaizQuadrada(RaizQuadrada raizQuadrada);
    void aceitaNumero(Numero numero);
}

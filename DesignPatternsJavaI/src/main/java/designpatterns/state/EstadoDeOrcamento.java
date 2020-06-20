package designpatterns.state;

public interface EstadoDeOrcamento {

    void aplicaDescontoExtra(Orcamento orcamento);

    void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finaliza(Orcamento orcamento);
}

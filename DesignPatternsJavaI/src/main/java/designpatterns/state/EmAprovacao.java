package designpatterns.state;

public class EmAprovacao implements EstadoDeOrcamento {

    private boolean descontoAplicado = false;

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        if (!this.descontoAplicado) {
            orcamento.valor -= orcamento.valor * 0.05;
            this.descontoAplicado = true;
        } else {
            throw new RuntimeException("Desconto já aplicado");
        }
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos em aprovação não podem ir direto para finalizado");
    }
}

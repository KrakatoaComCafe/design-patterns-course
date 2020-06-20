package designpatterns.fiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;
    private List<ItemDaNota> todosItems;
    private double valorBruto;
    private double imposto;
    private String observacoes;
    private Calendar data;

    private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

    public NotaFiscalBuilder() {
        this.todosItems = new ArrayList<>();
        this.data = Calendar.getInstance();

        this.todasAcoesASeremExecutadas = new ArrayList<>();
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder com(ItemDaNota item) {
        todosItems.add(item);
        this.valorBruto += item.getValor();
        this.imposto += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naData(Calendar calendar) {
        this.data = calendar;
        return this;
    }

    public NotaFiscalBuilder adicionaAcao(AcaoAposGerarNota acao) {
        this.todasAcoesASeremExecutadas.add(acao);
        return this;
    }

    public NotaFiscal build() {
        NotaFiscal notaFiscal = new NotaFiscal(this.razaoSocial, this.cnpj, this.data, this.valorBruto, this.imposto, this.todosItems, this.observacoes);

        this.todasAcoesASeremExecutadas.forEach(acao -> acao.execute(notaFiscal));

        return notaFiscal;
    }
}

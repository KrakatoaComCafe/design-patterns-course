package designpatterns;

import designpatterns.fiscal.EnviadorDeEmail;
import designpatterns.fiscal.Impressora;
import designpatterns.fiscal.ItemDaNota;
import designpatterns.fiscal.Multiplicador;
import designpatterns.fiscal.NotaFiscal;
import designpatterns.fiscal.NotaFiscalBuilder;
import designpatterns.fiscal.NotaFiscalDao;

public class TesteAcoes {

    public static void main(String[] args) {
        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        NotaFiscal notaFiscal = builder
                .adicionaAcao(new Multiplicador(10))
                .adicionaAcao(new EnviadorDeEmail())
                .adicionaAcao(new NotaFiscalDao())
                .adicionaAcao(new EnviadorDeEmail())
                .adicionaAcao(new Impressora())
                .paraEmpresa("Caelum")
                .comCnpj("123")
                .com(new ItemDaNota("nome", 100))
                .comObservacoes("observação")
                .build();

        System.out.println(notaFiscal.getValorBruto());
    }
}

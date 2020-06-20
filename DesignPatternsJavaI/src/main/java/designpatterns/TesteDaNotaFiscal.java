package designpatterns;

import designpatterns.fiscal.ItemDaNota;
import designpatterns.fiscal.NotaFiscal;
import designpatterns.fiscal.NotaFiscalBuilder;

public class TesteDaNotaFiscal {

    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder();
        builder.paraEmpresa("Caelum Ensino e Inovação")
            .comCnpj("12.345.678/0001-12")
            .com(new ItemDaNota("item1", 200.0))
            .com(new ItemDaNota("item2", 300.0))
            .com(new ItemDaNota("item3", 400.0))
            .comObservacoes("observações");
        NotaFiscal notaFiscal = builder.build();

        System.out.println(notaFiscal.getValorBruto());
    }

}

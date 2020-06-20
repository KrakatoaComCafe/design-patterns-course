package designpatterns.fiscal;

public class Impressora implements AcaoAposGerarNota {

    public void execute(NotaFiscal notaFiscal) {
        System.out.println("imprime nota fiscal");
    }
}

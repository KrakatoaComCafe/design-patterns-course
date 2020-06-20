package designpatterns.fiscal;

public class NotaFiscalDao implements AcaoAposGerarNota {

    public void execute(NotaFiscal notaFiscal) {
        System.out.println("salvado no banco");
    }
}

package designpatterns.fiscal;

public class EnviadorDeSms implements AcaoAposGerarNota {

    public void execute(NotaFiscal notaFiscal) {
        System.out.println("enviado por sms");
    }
}

package designpatterns.fiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    public void execute(NotaFiscal notaFiscal) {
        System.out.println("email enviado");
    }
}

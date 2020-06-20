package designpatterns;

import designpatterns.impostos.*;
import designpatterns.state.Orcamento;

public class TesteDeImpostosComplexos {
    public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS(new ICPP()));
        Imposto impostao = new ImpostoMuitoAlto(new ISS(new ICMS(new ICPP())));
        Imposto outroImposto = new IKCV(new ICPP(new ISS()));

        Orcamento orcamento = new Orcamento(1500);

        double valor = iss.calcula(orcamento);

        System.out.println(valor);
        System.out.println(impostao.calcula(orcamento));
        System.out.println(outroImposto.calcula(orcamento));
    }
}

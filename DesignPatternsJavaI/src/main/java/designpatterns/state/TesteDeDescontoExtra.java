package designpatterns.state;

public class TesteDeDescontoExtra {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(500);

        orcamento.aplicaDescontoExtra();

        System.out.println(orcamento.getValor());

        orcamento.aprova();
        orcamento.aplicaDescontoExtra();

        System.out.println(orcamento.getValor());

        orcamento.finaliza();
        orcamento.aplicaDescontoExtra();

        System.out.println(orcamento.getValor());
    }
}

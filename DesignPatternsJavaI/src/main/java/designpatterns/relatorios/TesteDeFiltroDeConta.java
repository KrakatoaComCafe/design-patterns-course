package designpatterns.relatorios;

import designpatterns.relatorios.filtro.FiltrarNovaConta;
import designpatterns.relatorios.filtro.FiltroConta;
import designpatterns.relatorios.filtro.FiltroMenorQue100Reais;

import java.time.Instant;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class TesteDeFiltroDeConta {
    public static void main(String[] args) {
        Conta conta = new Conta(50, Instant.now().minus(Period.ofWeeks(2)));
        List<Conta> contas = Arrays.asList(conta);

        FiltroConta filtro = new FiltrarNovaConta(new FiltroMenorQue100Reais());

        List<Conta> contasFiltradas = filtro.filtrar(contas);

        for (Conta c : contasFiltradas) {
            System.out.println(c);
        }
    }
}

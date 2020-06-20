package designpatterns.relatorios.filtro;

import designpatterns.relatorios.Conta;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMenorQue100Reais extends FiltroConta {

    public FiltroMenorQue100Reais(FiltroConta filtroAdicional) {
        super(filtroAdicional);
    }

    public FiltroMenorQue100Reais() {
    }

    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        List<Conta> contasFiltradas = contas.stream().
                filter(conta -> conta.getSaldo() < 100).
                collect(Collectors.toList());

        if (this.filtroAdicional == null) {
            return contasFiltradas;
        }
        return this.filtroAdicional.filtrar(contasFiltradas);
    }
}

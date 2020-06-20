package designpatterns.relatorios.filtro;

import designpatterns.relatorios.Conta;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroSaldoMaiorQue50KReais extends FiltroConta {

    public FiltroSaldoMaiorQue50KReais(FiltroConta filtroAdicional) {
        super(filtroAdicional);
    }

    public FiltroSaldoMaiorQue50KReais() {
    }

    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        List<Conta> contasFiltradas = contas.stream().
                filter(conta -> conta.getSaldo() > 50000).
                collect(Collectors.toList());

        if (this.filtroAdicional == null) {
            return contasFiltradas;
        }
        return this.filtroAdicional.filtrar(contasFiltradas);
    }
}

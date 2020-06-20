package designpatterns.relatorios.filtro;

import designpatterns.relatorios.Conta;

import java.time.Instant;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarNovaConta extends FiltroConta {

    public FiltrarNovaConta(FiltroConta filtroAdicional) {
        super(filtroAdicional);
    }

    public FiltrarNovaConta() {
    }

    @Override
    public List<Conta> filtrar(List<Conta> contas) {
        Instant oneWeek = Instant.now().minus(Period.ofWeeks(1));
        List<Conta> listaFiltrada = contas.stream()
                .filter(conta -> conta.getDataCriacao().isBefore(oneWeek))
                .collect(Collectors.toList());

        if(this.filtroAdicional == null) {
            return listaFiltrada;
        }
        return this.filtroAdicional.filtrar(listaFiltrada);
    }
}

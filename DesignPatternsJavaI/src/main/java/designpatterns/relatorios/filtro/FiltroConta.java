package designpatterns.relatorios.filtro;

import designpatterns.relatorios.Conta;

import java.util.List;

public abstract class FiltroConta {

    protected FiltroConta filtroAdicional;

    public FiltroConta(FiltroConta filtroAdicional) {
        this.filtroAdicional = filtroAdicional;
    }

    public FiltroConta() {
        this.filtroAdicional = null;
    }

    public abstract List<Conta> filtrar(List<Conta> contas);
}

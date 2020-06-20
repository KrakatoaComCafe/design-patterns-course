package designpatterns.state;

import designpatterns.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Orcamento {

    protected EstadoDeOrcamento estadoAtual;

    protected double valor;
    private final List<Item> itens;

    public Orcamento(double valor) {
        this(valor, new ArrayList<Item>());
    }

    public Orcamento(double valor, List<Item> itens) {
        this.valor = valor;
        this.itens = itens;
        this.estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }

    public void adicionalItem(final Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

    public boolean contemItemDeNome(String nomeDoItem) {
        return itens.contains(nomeDoItem);
    }

    public boolean existemDoisItensIguaisNaLista() {
        Set<Item> itensSet = new HashSet<>();

        for (Item item : this.itens) {
            if (itensSet.contains(item)) {
                return true;
            }
            itensSet.add(item);
        }
        return false;
    }

    public void aplicaDescontoExtra() {
        this.estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova() {
        this.estadoAtual.aprova(this);
    }

    public void reprova() {
        this.estadoAtual.reprova(this);
    }

    public void finaliza() {
        this.estadoAtual.finaliza(this);
    }
}
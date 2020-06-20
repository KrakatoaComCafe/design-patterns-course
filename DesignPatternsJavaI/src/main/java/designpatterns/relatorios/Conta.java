package designpatterns.relatorios;

import java.time.Instant;

public class Conta {
    protected double saldo;
    private Instant dataCriacao;
    protected EstadoDaConta estadoDaConta;

    public Conta(double saldo, Instant dataCriacao) {
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
        estadoDaConta = new Positivo();
    }

    public double getSaldo() {
        return saldo;
    }

    public Instant getDataCriacao() {
        return dataCriacao;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", dataCriacao=" + dataCriacao +
                '}';
    }

    public void saca(double valor) {
        estadoDaConta.saca(this, valor);
    }

    public void deposita(double valor) {
        estadoDaConta.deposita(this, valor);
    }
}

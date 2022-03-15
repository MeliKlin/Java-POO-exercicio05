package com.mercadolivre.banco.transacoes;

public class Deposito implements OperacaoStrategy {

    private boolean permitido;

    public Deposito(boolean permitido) {
        this.permitido = permitido;
    }

    public void transacaoNaoOk() {
        System.out.println("Operacao de deposito indisponivel");
    }

    public void transacaoOk() {
        System.out.println("Deposito realizado com sucesso.");
    }

    public void execute() {
        if (this.permitido) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }
}

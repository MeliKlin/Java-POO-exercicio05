package com.mercadolivre.banco.transacoes;

public class SaqueDinheiro implements OperacaoStrategy {

    private boolean permitido;

    public SaqueDinheiro(boolean permitido) {
        this.permitido = permitido;
    }

    @Override
    public void execute() {
        if (permitido) {
            transacaoOk();
        } else {
            transacaoNaoOk();
        }
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Operacao de saque em dinheiro indisponivel");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Saque em dinheiro realizado com sucesso.");
    }
}

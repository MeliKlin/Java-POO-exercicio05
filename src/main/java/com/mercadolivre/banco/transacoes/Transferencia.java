package com.mercadolivre.banco.transacoes;

public class Transferencia implements OperacaoStrategy {

    private boolean permitido;

    public Transferencia(boolean permitido) {
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
        System.out.println("Operacao de transferencia indisponivel");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Transferencia realizada com sucesso");
    }
}

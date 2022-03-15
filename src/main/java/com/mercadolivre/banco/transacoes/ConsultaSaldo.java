package com.mercadolivre.banco.transacoes;

public class ConsultaSaldo implements OperacaoStrategy {

    private boolean permitido;

    public ConsultaSaldo(boolean permitido) {
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
        System.out.println("Operacao de consulta de saldo indisponivel.");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Consulta de saldo realizado com sucesso.");
    }
}

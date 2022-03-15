package com.mercadolivre.banco.transacoes;

public class PagamentoServico implements OperacaoStrategy {

    private boolean permitido;

    public PagamentoServico(boolean permitido) {
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
        System.out.println("Pagamento do servico realizado com sucesso.");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Operacao de pagamento de servico indisponivel");
    }
}

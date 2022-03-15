package com.mercadolivre.banco.transacoes;

public interface OperacaoStrategy {

    public void execute();

    public void transacaoNaoOk();
    public void transacaoOk();

}

package com.mercadolivre.banco.factories;

import com.mercadolivre.banco.transacoes.*;

public class Basico implements ContaFactory {

    private Deposito deposito;
    private ConsultaSaldo consultaSaldo;
    private SaqueDinheiro saqueDinheiro;
    private Transferencia transferencia;
    private PagamentoServico pagamentoServico;
    private OperacaoStrategy strategy;

    public Basico() {
        deposito = new Deposito(false);
        transferencia = new Transferencia(false);
        consultaSaldo = new ConsultaSaldo(true);
        saqueDinheiro = new SaqueDinheiro(true);
        pagamentoServico = new PagamentoServico(true);
    }

    @Override
    public void deposito() {
        deposito.execute();
    }

    @Override
    public void transferencia() {
        transferencia.execute();
    }

    @Override
    public void consultaSaldo() {
        consultaSaldo.execute();
    }

    @Override
    public void saqueDinheiro() {
        saqueDinheiro.execute();
    }

    @Override
    public void pagamentoServico() {
        pagamentoServico.execute();
    }
}

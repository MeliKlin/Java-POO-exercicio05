package com.mercadolivre.banco.factories;

import com.mercadolivre.banco.transacoes.*;

public class Executivo implements ContaFactory {

    private Deposito deposito;
    private ConsultaSaldo consultaSaldo;
    private SaqueDinheiro saqueDinheiro;
    private Transferencia transferencia;
    private PagamentoServico pagamentoServico;

    public Executivo() {
        deposito = new Deposito(true);
        transferencia = new Transferencia(true);
        consultaSaldo = new ConsultaSaldo(false);
        saqueDinheiro = new SaqueDinheiro(false);
        pagamentoServico = new PagamentoServico(false);
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

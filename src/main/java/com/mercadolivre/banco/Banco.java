package com.mercadolivre.banco;

import com.mercadolivre.banco.enums.TiposContas;
import com.mercadolivre.banco.factories.Conta;
import com.mercadolivre.banco.factories.Basico;

public class Banco {

    public static void main(String[] args) throws Exception {
        Basico cliente1 = (Basico) Conta.configure(TiposContas.BASICO);

        cliente1.deposito();
        cliente1.consultaSaldo();
    }

}

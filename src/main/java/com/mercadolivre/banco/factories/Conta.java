package com.mercadolivre.banco.factories;

import com.mercadolivre.banco.enums.TiposContas;

public class Conta {

    public static ContaFactory configure(TiposContas tipo) throws Exception {
        switch (tipo) {
            case EXECUTIVO:
                return new Executivo();
            case BASICO:
                return new Basico();
            case COBRADORES:
                return new Cobradores();
        }

        throw new Exception("Conta invalida");
    }

}

package com.mercadolivre.impressao.commands;

import com.mercadolivre.impressao.Impressora;

public class RelatorioCommand implements ImpressoraCommand {

    private Impressora impressora;

    public RelatorioCommand(Impressora impressora) {
        this.impressora = impressora;
    }

    @Override
    public void execute() {
        this.impressora.imprimirRelatorio();
    }
}

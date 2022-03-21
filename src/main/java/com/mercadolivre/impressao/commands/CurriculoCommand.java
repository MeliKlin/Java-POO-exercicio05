package com.mercadolivre.impressao.commands;

import com.mercadolivre.impressao.Impressora;

public class CurriculoCommand implements ImpressoraCommand {

    private Impressora impressora;

    public CurriculoCommand(Impressora impressora) {
        this.impressora = impressora;
    }

    @Override
    public void execute() {
        impressora.imprimirCurriculo();
    }

}

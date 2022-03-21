package com.mercadolivre.impressao.commands;

import com.mercadolivre.impressao.Impressora;

public class PdfCommand implements ImpressoraCommand {

    private Impressora impressora;

    public PdfCommand(Impressora impressora) {
        this.impressora = impressora;
    }

    @Override
    public void execute() {
        this.impressora.imprimirPdf();
    }

}

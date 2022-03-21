package com.mercadolivre.impressao;

import com.mercadolivre.impressao.commands.CurriculoCommand;
import com.mercadolivre.impressao.commands.ImpressoraInvoker;
import com.mercadolivre.impressao.commands.PdfCommand;
import com.mercadolivre.impressao.commands.RelatorioCommand;

public class Programa {

    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        CurriculoCommand curriculo = new CurriculoCommand(impressora);
        PdfCommand pdf = new PdfCommand(impressora);
        RelatorioCommand relatorio = new RelatorioCommand(impressora);

        ImpressoraInvoker invoker = new ImpressoraInvoker();
        invoker.addCommand("curriculo", curriculo);
        invoker.addCommand("pdf", pdf);
        invoker.addCommand("relatorio", relatorio);

        invoker.executeCommand("curriculo");
        invoker.executeCommand("pdf");
        invoker.executeCommand("relatorio");
    }

}

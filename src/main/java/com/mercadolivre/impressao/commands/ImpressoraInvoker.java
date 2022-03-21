package com.mercadolivre.impressao.commands;

import java.util.HashMap;
import java.util.List;

public class ImpressoraInvoker {

    HashMap<String, ImpressoraCommand> commands = new HashMap<>();

    public void addCommand(String key, ImpressoraCommand command) {
        this.commands.put(key, command);
    }

    public void executeCommand(String key) {
        ImpressoraCommand command = commands.get(key);
        if (command != null) {
            command.execute();
        }
    }

}

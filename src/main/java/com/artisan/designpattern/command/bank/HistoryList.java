package com.artisan.designpattern.command.bank;

import java.util.ArrayList;
import java.util.Collection;

public class HistoryList {
    Collection<AccountCommand> commands = new ArrayList<>();
    Collection<AccountCommand> undo = new ArrayList<>();
    public void addCommand(AccountCommand command)
    {
        commands.add(command);
    }
    public Boolean undo() {
        if(commands.size() > 0) {
            AccountCommand command = ((ArrayList<AccountCommand>) commands).get(commands.size()-1);
            command.unExecute();
            undo.add(command);
            ((ArrayList<AccountCommand>) commands).remove(command);
        }
        return Boolean.TRUE;
    }

    public Boolean redo() {
        if(undo.size() >0) {
            AccountCommand command = ((ArrayList<AccountCommand>)undo).get(undo.size()-1);
            command.execute();
            ((ArrayList<AccountCommand>) undo).remove(command);
            commands.add(command);
        }

        return Boolean.TRUE;
    }
}

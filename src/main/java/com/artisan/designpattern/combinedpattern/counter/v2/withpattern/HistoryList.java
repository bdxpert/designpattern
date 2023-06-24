package com.artisan.designpattern.combinedpattern.counter.v2.withpattern;

import java.util.ArrayList;
import java.util.Collection;

public class HistoryList {
    Collection<CounterCommand> counterCommands = new ArrayList<CounterCommand>();
    Collection<CounterCommand> undoList = new ArrayList<CounterCommand>();

    public void addCommand(CounterCommand command) {
        counterCommands.add(command);
    }
    public Boolean undo() {
        if(counterCommands.size()>0) {
            CounterCommand command = ((ArrayList<CounterCommand> )counterCommands).get(counterCommands.size()-1);
            command.unExecute();
            ((ArrayList<CounterCommand>) counterCommands).remove(command);
            undoList.add(command);
        }
        return Boolean.TRUE;
    }
    public Boolean redo() {
        if(undoList.size()>0) {
            CounterCommand command = ((ArrayList<CounterCommand>) undoList).get(undoList.size()-1);
            command.execute();
            ((ArrayList<CounterCommand>) undoList).remove(command);
            counterCommands.add(command);
        }
        return Boolean.TRUE;
    }
}
package com.thoughtworks.calculator;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<String> historyOfCommands;

    public History() {
        historyOfCommands = new ArrayList<String>();
    }

    public void add(String command) {
        historyOfCommands.add(command);
    }

    public List<String> getHistory(int noOfCommands) {
        List<String> historyOfCommandsToBeReturned = new ArrayList<String>();
        for (int i = historyOfCommands.size() - noOfCommands ; i < historyOfCommands.size() ; i++) {
            historyOfCommandsToBeReturned.add(historyOfCommands.get(i));
        }
        return historyOfCommandsToBeReturned;
    }
}

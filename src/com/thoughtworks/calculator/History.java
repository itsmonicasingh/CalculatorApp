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

    public String get(int index) {
        return historyOfCommands.get(index);
    }

    public List<String> getHistory() {
        return historyOfCommands;
    }
}

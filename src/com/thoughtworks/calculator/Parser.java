package com.thoughtworks.calculator;

public class Parser {

    private String inputCommand;
    private String tokens[];

    Parser(String inputCommand) {
        this.inputCommand = inputCommand;
    }

    public String[] parse() {
        tokens = inputCommand.split(" ");
        return tokens;
    }

    public boolean accept() {
        if(tokens.length <=2) {
            return true;
        }
        else
            return false;
    }
}

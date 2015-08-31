package com.thoughtworks.calculator;

public class Parser {

    String inputCommand;

    Parser(String inputCommand) {
        this.inputCommand = inputCommand;
    }

    public boolean accept(){
        String tokens[] = inputCommand.split(" ");
        if(tokens.length <=2)
            return true;
        else
            return false;
    }
}

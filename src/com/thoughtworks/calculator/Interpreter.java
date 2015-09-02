//Interpreter tokenizes the command and passes over the parsed command to the calculator
package com.thoughtworks.calculator;

public class Interpreter {

    private Calculator calculator;

    public Interpreter(Calculator calculator) {
        this.calculator = calculator;
    }

    public double parseInput(String command) {
        String[] tokenizedCommand = command.split(" ");
        if (tokenizedCommand.length == 2 && isNumeric(tokenizedCommand[1])) {
            if (tokenizedCommand[0].equals("add")) {
                Adder adder = new Adder();
                calculator.performBinaryOperation(adder, Double.parseDouble(tokenizedCommand[1]));
            }
            if (tokenizedCommand[0].equals("subtract")) {
                Subtractor subtractor = new Subtractor();
                calculator.performBinaryOperation(subtractor, Double.parseDouble(tokenizedCommand[1]));
            }
            if (tokenizedCommand[0].equals("multiply")) {
                Multiplier multiplier = new Multiplier();
                calculator.performBinaryOperation(multiplier , Double.parseDouble(tokenizedCommand[1]));
            }
            if (tokenizedCommand[0].equals("divide")) {
                Divider divider = new Divider();
                calculator.performBinaryOperation(divider, Double.parseDouble(tokenizedCommand[1]));
            }
        }
        if (tokenizedCommand.length == 1) {
            if (tokenizedCommand[0].equals("absolute")) {
                Absolute absolute = new Absolute();
                calculator.performUnaryOperation(absolute);
            }

        }
        return calculator.getAccumulator();
    }

    private boolean isNumeric(String operand) {
        try {
            Double.parseDouble(operand);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}

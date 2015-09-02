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
            if (tokenizedCommand[0].equals("abs")) {
                Absolute absolute = new Absolute();
                calculator.performUnaryOperation(absolute);
            }
            if (tokenizedCommand[0].equals("sqr")) {
                Square square = new Square();
                calculator.performUnaryOperation(square);
            }
            if (tokenizedCommand[0].equals("sqrt")) {
                SquareRoot squareRoot = new SquareRoot();
                calculator.performUnaryOperation(squareRoot);
            }
            if (tokenizedCommand[0].equals("cube")) {
                Cube cube = new Cube();
                calculator.performUnaryOperation(cube);
            }
            if (tokenizedCommand[0].equals("cubert")) {
                CubeRoot cubeRoot = new CubeRoot();
                calculator.performUnaryOperation(cubeRoot);
            }
            if (tokenizedCommand[0].equals("neg")) {
                Negation negation = new Negation();
                calculator.performUnaryOperation(negation);
            }
            if (tokenizedCommand[0].equals("cancel")) {
                Cancel cancel = new Cancel();
                calculator.performUnaryOperation(cancel);
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

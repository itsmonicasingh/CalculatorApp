package com.thoughtworks.calculator;


public class Absolute implements UnaryOperator {

    @Override
    public double doOperation(double operand) {
        if (operand < 0)
            return (-1 * operand);
        return operand;
    }
}

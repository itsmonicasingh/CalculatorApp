package com.thoughtworks.calculator;

//cancel resets the calculator
public class Cancel implements UnaryOperator {
    @Override
    public double doOperation(double operand) {
        return 0;
    }
}

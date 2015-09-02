//Calculator alters its result according to the received command
package com.thoughtworks.calculator;

public class Calculator {

    private double accumulator;

    public Calculator(double accumulator) {
        this.accumulator = accumulator;
    }

    public double performBinaryOperation(BinaryOperator binaryOperator, double operand) {
        accumulator = binaryOperator.doOperation(this.accumulator, operand);
        return accumulator;
    }

    public double performUnaryOperation(UnaryOperator unaryOperator ) {
        return accumulator = unaryOperator.doOperation(this.accumulator );
    }

    public double getAccumulator() {
        return this.accumulator;
    }

}

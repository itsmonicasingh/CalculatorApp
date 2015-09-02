package com.thoughtworks.calculator;

import static java.lang.Math.pow;

public class Cube implements UnaryOperator{

    @Override
    public double doOperation(double operand) {
        return (pow(operand, 3));
    }
}

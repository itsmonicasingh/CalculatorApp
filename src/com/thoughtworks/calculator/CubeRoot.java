package com.thoughtworks.calculator;

import static java.lang.Math.cbrt;
import static java.lang.Math.pow;

public class CubeRoot implements UnaryOperator{
    @Override
    public double doOperation(double operand) {
        return cbrt(operand);
    }
}

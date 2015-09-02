package com.thoughtworks.calculator;


public class Negation implements UnaryOperator{

    @Override
    public double doOperation(double operand) {
        if (operand == 0)
            return 0;
        return (-1 * operand);

    }
}

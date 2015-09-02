//Square is a unary operator which takes an operator and returns its squared value
package com.thoughtworks.calculator;

public class Square implements UnaryOperator {

    @Override
    public double doOperation(double operand) {
        return Math.pow(operand, 2.0);
    }
}

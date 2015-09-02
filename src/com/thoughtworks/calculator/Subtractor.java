//Subtractor is a Binary Operator which takes two operands and returns their difference
package com.thoughtworks.calculator;

public class Subtractor implements BinaryOperator {

    @Override
    public double doOperation(double operand1, double operand2) {
        return operand1 - operand2;
    }
}

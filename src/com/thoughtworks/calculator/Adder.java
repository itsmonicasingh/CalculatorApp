//Adder is a Binary Operator which takes two operands and returns its sum
package com.thoughtworks.calculator;

public class Adder implements BinaryOperator {

    @Override
    public double doOperation(double operand1, double operand2) {
        return operand1 + operand2;
    }
}

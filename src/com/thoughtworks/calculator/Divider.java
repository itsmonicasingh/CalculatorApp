//Divider is a Binary Operator which takes a divisor and a dividend and returns the quotient
package com.thoughtworks.calculator;

public class Divider implements BinaryOperator {

    @Override
    public double doOperation(double operand1, double operand2) {
        if(operand2 != 0)
            return operand1 / operand2;
        return 0.0;
    }
}

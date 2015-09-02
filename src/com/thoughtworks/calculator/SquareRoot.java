//A SquareRoot takes an operand and returns its square root
package com.thoughtworks.calculator;

import static java.lang.Math.sqrt;

public class SquareRoot implements UnaryOperator {

    @Override
    public double doOperation(double operand) {
        if(operand>0)
            return (sqrt(operand));
        return 0;
    }
}

package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldRightlyReturnInitialAccumulator() {
        Calculator calculator = new Calculator(1);

        assertEquals(1.0, calculator.getAccumulator(), 0.0);
    }

    @Test
    public void shouldRightlyReturnModifiedAccumulatorIfBinaryOperationIsPerformed() {
        Calculator calculator = new Calculator(0);

        Adder adder = new Adder();

        assertEquals(6, calculator.performBinaryOperation(adder, 6), 0.0);
    }
}

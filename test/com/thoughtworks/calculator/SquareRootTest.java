package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareRootTest {

    @Test
    public void shoudlReturnZeroIfOperandIsZero() {
        SquareRoot squareRoot = new SquareRoot();

        assertEquals(0.0, squareRoot.doOperation(0), 0.0);
    }

    @Test
    public void shoudlReturnValidSquareRootIfNotZero() {
        SquareRoot squareRoot = new SquareRoot();

        assertEquals(2.0, squareRoot.doOperation(4.0), 0.0);
    }

    @Test
    public void shoudldReturnValidZeroIfNegitiveNumber() {
        SquareRoot squareRoot = new SquareRoot();

        assertEquals(0.0, squareRoot.doOperation(-4.0), 0.0);
    }
}

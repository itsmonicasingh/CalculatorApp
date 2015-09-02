package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void shoudlReturnZeroIfOperandIsZero() {
        Square square = new Square();

        assertEquals(0.0, square.doOperation(0), 0.0);
    }

    @Test
    public void shoudlReturnValidSquareIfNotZero() {
        Square square = new Square();

        assertEquals(4.0, square.doOperation(2), 0.0);
    }

}

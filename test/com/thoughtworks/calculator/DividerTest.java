package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DividerTest {

    @Test
    public void shouldSuccessfullyDivideOperand1ByOperand2() {
        Divider divider = new Divider();

        assertEquals(0.5, divider.doOperation(2, 4), 0.0);
    }

    @Test
    public void shouldReturnZeroIfOperand2IsZero() {
        Divider divider = new Divider();

        assertEquals(0.0, divider.doOperation(2, 0), 0.0);
    }
}

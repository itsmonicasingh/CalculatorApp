package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractorTest {

    @Test
    public void shouldSuccessfullySubtractOperand2FromOperand1 () {
        Subtractor subtractor = new Subtractor();

        assertEquals(2.0, subtractor.doOperation(4, 2), 0.0);
    }
}

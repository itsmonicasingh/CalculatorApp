package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdderTest {

    @Test
    public void shouldSuccessfullyAddTwoOperands() {
        Adder adder = new Adder();

        assertEquals(4.0, adder.doOperation(2, 2), 0.0);
    }
}

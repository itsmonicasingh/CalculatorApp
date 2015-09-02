package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplierTest {

    @Test
    public void shouldSuccessfullyMultiplyOperand1ToOperand2() {
        Multiplier multiplier = new Multiplier();

        assertEquals(2.0, multiplier.doOperation(0.5, 4), 0.0);
    }
}

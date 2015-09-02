package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NegationTest {

    @Test
    public void isZeroForZero() {
        Negation negation = new Negation();
        assertEquals(0.0,negation.doOperation(0),0.0);
    }

    @Test
    public void isPositiveForNegativeNumber() {
        Negation negation = new Negation();
        assertEquals(3.0,negation.doOperation(-3),0.0);
    }

    @Test
    public void isNegativeForPositiveNumber() {
        Negation negation = new Negation();
        assertEquals(-3.0,negation.doOperation(3),0.0);
    }


}


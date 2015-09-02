package com.thoughtworks.calculator;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbsoluteTest {

    @Test
    public void valueIsZeroForZero() {
        Absolute absolute = new Absolute();
        assertEquals(0.0,absolute.doOperation(0),0.0);
    }

    @Test
    public void valueIsSameForPositiveNumber() {
        Absolute absolute = new Absolute();
        assertEquals(3.0,absolute.doOperation(3),0.0);
    }

    @Test
    public void valueIsPositiveForNegitiveNumber() {
        Absolute absolute = new Absolute();
        assertEquals(3.0,absolute.doOperation(-3),0.0);
    }
}

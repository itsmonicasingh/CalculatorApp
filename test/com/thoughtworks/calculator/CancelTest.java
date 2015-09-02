package com.thoughtworks.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CancelTest {

    @Test
    public void shouldResetTheCalculatorToZeroWhenCancelIsPressed()
    {
        Cancel cancel=new Cancel();
        assertEquals(0.0,cancel.doOperation(4.0));
    }
}

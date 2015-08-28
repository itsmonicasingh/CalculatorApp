package com.thoughtworks.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Test
    public void shouldReturnZeroWhenSwitchedOn() {
        calculator = new Calculator();
        assertEquals(calculator.calculate(), 0.0);
    }

}
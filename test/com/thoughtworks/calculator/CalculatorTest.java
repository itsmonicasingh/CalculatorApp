package com.thoughtworks.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void shouldPerformValidAddition() {
        assertEquals(calculator.calculate("add 3"), 3.0);
    }

    @Test
    public void shouldPerformValidSubtraction() {
        assertEquals(calculator.calculate("subtract 2"), -2.0);
    }

    @Test
    public void shouldPerformValidMultiplication() {
        assertEquals(calculator.calculate("multiply 5"), 0.0);
    }




}
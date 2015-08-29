package com.thoughtworks.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    Calculator calculator = new Calculator();
    
    @Test
    public void shouldPerformValidAddition() {
        assertEquals(calculator.calculate("add 3"), 3.0);
    }




}
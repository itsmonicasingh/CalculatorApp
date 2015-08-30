package com.thoughtworks.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldPerformValidAddition() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.calculate("add 3"), 3.0);
    }

    @Test
    public void shouldPerformValidSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.calculate("subtract 1"), -1.0);
    }

    @Test
    public void shouldPerformValidMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.calculate("multiply 5"), 0.0);
    }

    @Test
    public void shouldPerformValidDivision() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.calculate("divide 5"), 0.0);
    }

    @Test
    public void shouldReturnZeroWhenCancelIsPressed() {
        Calculator calculator = new Calculator();
        assertEquals(calculator.calculate("cancel"), 0.0);
    }

    @Test
    public void shouldPerformValidSetOfOperations() {
        Calculator calculator = new Calculator();
        calculator.calculate("add 5");
        calculator.calculate("add 2");
        assertEquals(calculator.calculate("multiply 3"), 21.0);
    }
}
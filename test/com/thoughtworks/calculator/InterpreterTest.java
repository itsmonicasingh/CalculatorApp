package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterpreterTest {

    @Test
    public void shouldReturnPreviousAccumulatorInCalculatorOnParsingInvalidCommand() {
        Calculator calculator = new Calculator(0);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(0.0, interpreter.parseInput("Dummy Command"), 0.0);
    }

    @Test
    public void shouldSuccessfullyAddOnCommand() {
        Calculator calculator = new Calculator(0);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(2.0, interpreter.parseInput("add 2"), 0.0);
    }

    @Test
    public void shouldReturnPreviousAccumulatorInCalculatorWhenMoreThanTwoTokenCommand() {
        Calculator calculator = new Calculator(0);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(0.0, interpreter.parseInput("add 3 add"), 0.0);
    }

    @Test
    public void shouldReturnPreviousAccumulatorInCalculatorWhenCommandHasZeroTokens() {
        Calculator calculator = new Calculator(4);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(4.0, interpreter.parseInput(""), 0.0);
    }

    @Test
    public void shouldReturnPreviousAccumulatorInCalculatorIfSecondTokenInCommandIsNotANumber() {
        Calculator calculator = new Calculator(0);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(0.0, interpreter.parseInput("add five"), 0.0);
    }

    @Test
    public void shouldSuccessfullySubtractOnCommand() {
        Calculator calculator = new Calculator(0);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(-2.0, interpreter.parseInput("subtract 2"), 0.0);
    }

    @Test
    public void shouldSuccessfullyMultiplyOnCommand() {
        Calculator calculator = new Calculator(1);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(4.0, interpreter.parseInput("multiply 4"), 0.0);
    }

    @Test
    public void shouldSuccessfullyDivideOnCommand() {
        Calculator calculator = new Calculator(4);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(1.0, interpreter.parseInput("divide 4"), 0.0);
    }

    @Test
    public void shouldSuccessfullyReturnAbsoluteValueOnCommand() {
        Calculator calculator = new Calculator(-5);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(5.0, interpreter.parseInput("abs"), 0.0);
    }

    @Test
    public void shouldSuccessfullyReturnSquareOnCommand() {
        Calculator calculator = new Calculator(-5);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(25.0, interpreter.parseInput("sqr"), 0.0);
    }

    @Test
    public void shouldSuccessfullyReturnSquareRootOnCommand() {
        Calculator calculator = new Calculator(25);
        Interpreter interpreter = new Interpreter(calculator);

        assertEquals(5.0, interpreter.parseInput("sqrt"), 0.0);
    }


}

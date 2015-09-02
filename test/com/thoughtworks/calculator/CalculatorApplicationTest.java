package com.thoughtworks.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorApplicationTest {

    @Test
    public void shouldPassACommandToTheInterpreter()  {
        Calculator calculator =new Calculator(4);
        Interpreter interpreter=new Interpreter(calculator);
        CalculatorApplication calculatorApplication = new CalculatorApplication();
        assertEquals(interpreter.parseInput(calculatorApplication.getInput()),9.0);
    }


}

package com.thoughtworks.calculator;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorViewTest {

    @Test
    public void acceptAnInput() {
        CalculatorView cv=new CalculatorView();
        Mockito.verify(cv).acceptAnInput();
    }
}

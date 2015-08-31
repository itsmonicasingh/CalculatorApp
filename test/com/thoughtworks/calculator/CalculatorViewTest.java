package com.thoughtworks.calculator;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorViewTest {

    @Test
    public void shouldAcceptAnInput() {
        CalculatorView cv=new CalculatorView();
        Mockito.verify(cv).acceptAnInput();
    }

    @Test
    public void shouldCallTheParser() {
        CalculatorView cv=new CalculatorView();
        Mockito.verify(cv).dispatchInputToParser();
    }

}

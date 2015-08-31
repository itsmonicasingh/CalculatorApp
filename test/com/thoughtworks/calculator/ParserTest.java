package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void shouldAcceptAValidString() {
        Parser p=new Parser("add 3");
        assertTrue(p.accept());
    }
}

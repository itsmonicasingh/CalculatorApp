package com.thoughtworks.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void shouldAcceptAValidString() {
        Parser p=new Parser("add 3");
        assertTrue(p.accept());
    }

    @Test
    public void shouldNotAcceptAInvalidString() {
        Parser p=new Parser("add add 3");
        assertFalse(p.accept());
    }

    @Test
    public void shouldGiveTheOperator(){
        Parser p = new Parser(("add 3"));
        assertEquals("add", p.parse()[0]);
    }
}

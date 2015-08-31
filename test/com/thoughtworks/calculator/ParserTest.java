package com.thoughtworks.calculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void shouldValidateAValidString() {
        Parser p=new Parser("add 3");
        assertTrue(p.validate());
    }

    @Test
    public void shouldNotValidateAInvalidString() {
        Parser p=new Parser("add add 3");
        assertFalse(p.validate());
    }

    @Test
    public void shouldGiveTheOperator(){
        Parser p = new Parser(("add 3"));
        assertEquals("add", p.parse()[0]);
    }

    @Test
    public void shouldGiveTheOperand(){
        Parser p = new Parser(("add 3"));
        assertEquals("3", p.parse()[1]);
    }
}

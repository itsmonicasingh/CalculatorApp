package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HistoryTest {

    @Test
    public void shouldReturnPreviousCommandWhenRepeatIsOne() {
        History history = new History();
        history.add("add 1");
        assertEquals("add 1",history.get(0));
    }
}

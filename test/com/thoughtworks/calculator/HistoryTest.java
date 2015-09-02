package com.thoughtworks.calculator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HistoryTest {

    @Test
    public void shouldReturnPreviousCommandWhenRepeatIsOne() {
        History history = new History();
        history.add("add 1");
        List<String> expectedHistory = new ArrayList<String>(){{add("add 1");}};
        assertEquals(expectedHistory,history.getHistory(1));
    }

    @Test
    public void shouldReturnPreviousTwoCommandWhenRepeatIsTwo() {
        History history = new History();
        List<String> expectedHistory = new ArrayList<String>(){{add("add 1"); add("add 4");}};
        history.add("add 1");
        history.add("add 4");
        assertEquals(expectedHistory,history.getHistory(2));
    }

}

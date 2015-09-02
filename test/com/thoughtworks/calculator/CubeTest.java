package com.thoughtworks.calculator;

import com.thoughtworks.calculator.Cube;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CubeTest {

    @Test
    public void shoudlReturnZeroIfOperandIsZero() {
        Cube cube = new Cube();

        assertEquals(0.0, cube.doOperation(0), 0.0);
    }

    @Test
    public void shoudlReturnValidCubeIfNotZero() {
        Cube cube = new Cube();

        assertEquals(8.0, cube.doOperation(2), 0.0);
    }
}
